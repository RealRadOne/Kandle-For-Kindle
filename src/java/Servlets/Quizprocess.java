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
    String QuizID=(String)request.getSession().getAttribute("QuizName");
    response.setContentType("application/json");
    PrintWriter out = response.getWriter();
    JSONObject obj=new JSONObject();
    QuizDAO qd=new QuizDAO();
    Quiz q=qd.FindQuiz(QuizID);
    //For creating a new Quiz
    ArrayList<String>al=new ArrayList();
    //Creating a question and sending values to DB
    try
    {
       JSONArray jArray=new JSONArray(myResponse);
       for(int i=0;i<jArray.length()+2;i++)
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
           //String ans=jobj.getString("Ans");
           qs.setAns(jobj.getString("Ans"));
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