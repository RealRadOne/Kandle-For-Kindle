/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testers;
import java.util.List;
import DAO.QuestionDAO;
import Model.Question;
import com.mongodb.MongoClient;
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
   q.setQuizID("NARNIA1123");
   q.setQuestion("What do you infer from the book");
   q.setAns(4);
   MongoClient mongo = new MongoClient("localhost", 27017);
   QuestionDAO qDAO = new QuestionDAO(mongo);
   //Create
   qDAO.createQuestion(q);
   System.out.println("Question Added Successfully with id="+q.getQuizID()+","+q.getQuestion()+","+q.getAns()+","+q.getOption1());
   q.setOption1("Here is to Never Growing");
   qDAO.updateQuestion(q);
   System.out.println("Question Updated Successfully with id="+q.getQuizID()+","+q.getQuestion()+","+q.getAns()+","+q.getOption1()); 
   List<Question> list=qDAO.readAllQuestions();
   for(Question us:list)
   {
       System.out.println(us.getQuestionID()+","+us.getQuestion()+","+us.getAns());
   }
 }
}
