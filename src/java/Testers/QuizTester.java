/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testers;
import DAO.QuizDAO;
import Model.Quiz;
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
   q.setQuizID("GEN1001");
   q.setAuthorID("U0001");
   q.setDate("28/6/1998");
   q.setQuizName("GenTest");
   q.setBookID("BKK1129");
   q.setUserID("BKK1132");
   q.setScore(50);
   q.setHour(0);
   q.setMinute(10);
   q.setSecond(30);
   QuizDAO qDAO = new QuizDAO();
   //Create
   qDAO.createQuiz(q);
   Quiz qq=qDAO.FindQuiz("GEN1001");
   System.out.println(qq.getMinute());
   List<Quiz>qr=qDAO.findByAuthor("RadOne");
   for(Quiz qm:qr)
   {
       System.out.println(qm.getQuizID());
   }
 }
}
