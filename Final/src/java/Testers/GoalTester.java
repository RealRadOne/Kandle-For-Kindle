/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testers;
import java.util.List;
import DAO.GoalDAO;
import Model.Goal;
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
   Goal g=new Goal();
   g.setUserId("NARNIA1123");
   g.setDate(new Date());
   MongoClient mongo = new MongoClient("localhost", 27017);
   GoalDAO gDAO = new GoalDAO(mongo);
   //Create
   gDAO.createGoal(g);
   System.out.println("Question Added Successfully with id="+g.getGoalId()+","+g.getDate()+","+g.getUserId());
   g.setUserId("89563");
   gDAO.updateGoal(g);
   System.out.println("Goal Updated Successfully with id="+g.getGoalId()+","+g.getDate()+","+g.getUserId()); 
   List<Goal> list=gDAO.readUserwise("NARNIA1123");
   for(Goal us:list)
   {
       System.out.println(us.getGoalId()+","+us.getDate()+","+us.getUserId());
   }
 }
}
