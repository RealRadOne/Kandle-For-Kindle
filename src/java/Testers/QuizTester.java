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
     QuizDAO qk=new QuizDAO();
     List<Quiz>alls=qk.readAllQuiz();
     for(Quiz qs:alls)
     {
         System.out.println(qs.getQuizID());
     }
 }
}
