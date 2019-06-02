/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;
import java.util.*;
import org.json.JSONObject;
import org.json.JSONArray;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import DAO.*;
import Model.*;

/**
 *
 * @author Sakshi Sinha
 */
public class Quizprocess extends HttpServlet {
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
  doPost(request, response);
  }
     protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
    {
    String myResponse = request.getParameter("jsonData");
    response.setContentType("application/json");
    PrintWriter out = response.getWriter();
    JSONObject obj=new JSONObject();
    //For creating a new Quiz
    Quiz q=new Quiz();
    q.setQuizName("Test003");
    q.setQuizID("TCheck89475");
    QuizDAO qDAO = new QuizDAO();
    qDAO.createQuiz(q);
    ArrayList<String>al=new ArrayList();
    //Creating a question and sending values to DB
    try
    {
       JSONArray jArray=new JSONArray(myResponse);
       for(int i=0;i<jArray.length();i++)
       {
           Question qs=new Question();
           qs.setQuizID(q.getQuizID());
           JSONObject jobj=jArray.getJSONObject(i);
           String Question=jobj.getString("Question");
           qs.setQuestion(Question);
           qs.setOption1(jobj.getString("Option1"));
           qs.setOption2(jobj.getString("Option2"));
           qs.setOption3(jobj.getString("Option3"));
           qs.setOption4(jobj.getString("Option4"));
           //qs.setAns(jobj.getString("Ans"));
           QuestionDAO qsk=new QuestionDAO();
           qsk.createQuestion(qs);
           al.add(Question);
       }
    }
    catch(Exception e)
    {
        System.out.println("error");
    }
    
   
    
    //response.getWriter().write(al.toString());
    obj.put("message",al.toString());
    out.print(obj);
}
}