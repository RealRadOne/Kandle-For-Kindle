/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testers;
import java.util.List;
import DAO.QuestionDAO;
import Model.Question;
import java.net.UnknownHostException;

/**
 *
 * @author Sakshi Sinha
 */
public class QuestionTester 
{
     public static void main(String[] args) throws UnknownHostException 
 {
   Question q=new Question();
   q.setQuizID("Tester020");
   q.setQuestion("Guess the gender of Character003");
   q.setOption1("Male");
   q.setOption2("Female");
   q.setOption3("Bisexual");
   q.setOption4("Gay");
   q.setAns("d");
   q.setQuestionID("Q1001");
   QuestionDAO qDAO = new QuestionDAO();
   Question qs=qDAO.createQuestion(q);
   System.out.println("Question Added Successfully with id="+qs.getQuizID()+","+qs.getQuestion()+","+qs.getAns()+","+q.getQuestionID());
   //q.setOption1("Here is to Never Growing");
   //qDAO.updateQuestion(q);
   //System.out.println("Question Updated Successfully with id="+q.getQuizID()+","+q.getQuestion()+","+q.getAns()+","+q.getOption1()); 
   //List<Question> list=qDAO.readAllQuestions();
   //for(Question us:list)
   //{
       //System.out.println(us.getQuestionID()+","+us.getQuestion()+","+us.getAns());
   //}
   
   List<Question>result=qDAO.QuesByQuiz("Koo23");
   for(Question qq:result)
   {
       System.out.println(qq.getQuestionID()+"**"+qq.getQuestion()+"**"+qq.getOption1());
   }
   //Question qrk=qDAO.fetchQuestion("god");
   //System.out.println(qrk.getOption2());
 }
}
