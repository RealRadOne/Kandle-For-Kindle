/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testers;
import DAO.QuizDAO;
import Model.Quiz;
import java.net.UnknownHostException;
import java.util.*;
/**
 *
 * @author Sakshi Sinha
 */
public class QuizTester 
{
    public static void main(String[] args) throws UnknownHostException 
 {
   Quiz q=new Quiz();
   Date d1=new Date();
   q.setQuizID("Tester001");
   q.setAuthorID("ASPX1123");
   q.setDate(d1);
   q.setQuizName("HARRYPOTTER20");
   q.setBookID("FSK311");
   q.setUserID("U0001");
   QuizDAO qDAO = new QuizDAO();
   //Create
   qDAO.createQuiz(q);
   System.out.println("Quiz Updated Successfully with id="+q.getQuizID()+","+q.getAuthorID()+","+q.getBookID()+","+q.getQuizName());
   List<Quiz> sample=new ArrayList<Quiz>();
   sample=qDAO.findByUser("U0001");
   for(Quiz ss:sample)
   {
       System.out.println(ss.getQuizName());
   }
   Quiz qr=qDAO.FindQuiz("Tester001");
   System.out.println(qr.getQuizID()+","+qr.getQuizName()+","+qr.getUserID());
 }
}
