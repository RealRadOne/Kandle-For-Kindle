/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testers;
import DAO.*;
import Model.*;
import com.mongodb.MongoClient;
import java.net.UnknownHostException;
import java.util.List;
/**
 *
 * @author Sakshi Sinha
 */
public class QuizTester 
{
    public static void main(String[] args) throws UnknownHostException 
 {
   Quiz q=new Quiz();
   q.setQuizID("NARNIA1123");
   q.setAuthorID("ASPX1123");
   q.setBookID("NARNS123");
   q.setQuizName("RUNNAER");
   QuizDAO qDAO = new QuizDAO();
   //Create
   qDAO.createQuiz(q);
   System.out.println("Quiz Added Successfully with id="+q.getQuizID()+","+q.getAuthorID()+","+q.getBookID()+","+q.getQuizName());
   q.setQuizID("NIMARNS");
   qDAO.updateQuiz(q);
    System.out.println("Quiz Updated Successfully with id="+q.getQuizID()+","+q.getAuthorID()+","+q.getBookID()+","+q.getQuizName());       
 }
}
