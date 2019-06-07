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
   QuestionDAO qDAO = new QuestionDAO();
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
   
   List<Question>result=qDAO.QuesByQuiz("Tester020");
   for(Question qq:result)
   {
       System.out.println(qq.getQuestionID()+"**"+qq.getQuestion());
   }
   //Question qrk=qDAO.fetchQuestion("god");
   //System.out.println(qrk.getOption2());
 }
}
