/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testers;
import java.util.List;
import DAO.*;
import Model.*;
import com.mongodb.MongoClient;
import java.net.UnknownHostException;
import java.util.Date;
/**
 *
 * @author Sakshi Sinha
 */
public class GoalTester
{
     public static void main(String[] args) throws UnknownHostException 
 {
   GoalbyAuthor g=new GoalbyAuthor();
   
   
   g.setUserId("akanksha123");
   g.setDate(new Date());
   g.setAuthorId("abc126663");
   GoalbaDAO gDAO = new GoalbaDAO();
   //Create
   gDAO.createGoal(g);
   System.out.println(" Added Successfully with id="+g.getGoalId()+","+g.getDate()+","+g.getUserId()+","+g.getAuthorId());
   /*g.setUserId("89563");
   gDAO.updateGoal(g);
   System.out.println("Goal Updated Successfully with id="+g.getGoalId()+","+g.getDate()+","+g.getUserId()); */
   List<Goal> list=gDAO.readUserwise("akanksha123");
   for(Goal us:list)
   {
       GoalbyAuthor g1=(GoalbyAuthor) us;
       System.out.println(g1.getGoalId()+","+g1.getDate()+","+g1.getAuthorId());
   }
 }
}
