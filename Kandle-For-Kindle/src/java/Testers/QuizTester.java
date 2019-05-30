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
   q.setQuizID("SAMPLE19");
   q.setAuthorID("BETH20@IO");
   q.setDate(d1);
   q.setQuizName("SMARTYU");
   q.setBookID("BKK1129");
   q.setUserID("U000190");
   q.setScore(50);
   QuizDAO qDAO = new QuizDAO();
   //Create
   qDAO.createQuiz(q);
   //System.out.println("Quiz Created Successfully with id="+q.getQuizID()+","+q.getAuthorID()+","+q.getBookID()+","+q.getQuizName()); 
   List<Quiz>points=qDAO.SortByUsers("SAMPLE19");
   for(Quiz qm:points)
   {
       System.out.println(qm.getUserID()+","+qDAO.findByUser(qm.getUserID())+","+qm.getScore());
   }
 }
}
