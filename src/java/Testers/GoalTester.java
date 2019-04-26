/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testers;
import java.util.List;
import DAO.GoalbbDAO;
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
   GoalbyBook g=new GoalbyBook();
   g.setUserId("NARNIA11123");
   g.setDate(new Date());
   g.setBookID("126663");
   GoalbbDAO gDAO = new GoalbbDAO();
   //Create
   gDAO.createGoal(g);
   System.out.println("Question Added Successfully with id="+g.getGoalId()+","+g.getDate()+","+g.getUserId()+","+g.getBookID());
   g.setUserId("89563");
   gDAO.updateGoal(g);
   System.out.println("Goal Updated Successfully with id="+g.getGoalId()+","+g.getDate()+","+g.getUserId()); 
   List<Goal> list=gDAO.readUserwise("NARNIA1123");
   for(Goal us:list)
   {
       GoalbyBook g1=(GoalbyBook) us;
       System.out.println(g1.getGoalId()+","+g1.getDate()+","+g1.getBookID());
   }
 }
}
