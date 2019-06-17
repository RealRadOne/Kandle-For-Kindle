/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testers;
import DAO.*;
import Model.*;
import java.util.List;
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
   g.setGoalId("USR0016");
   GoalbaDAO gDAO = new GoalbaDAO();
   //Create
   Goal gk=gDAO.createGoal(g);
   System.out.println("Author Added Successfully with id="+gk.getGoalId()+","+gk.getDate()+","+gk.getUserId());
   g.setNum(20);
   gDAO.updateGoal(g);
   System.out.println("Author Goal Updated Successfully with id="+g.getGoalId()+","+g.getDate()+","+g.getNum()); 
   g.setBookId("BKK1198");
   //Create
   GoalbyBook gs=new GoalbyBook();
   gs.setGoalId("G1123");
   gs.setUserId("G234");
   gs.setBookID("BKK8978");
   GoalbbDAO gbAO=new GoalbbDAO();
   gbAO.createGoal(gs);
   gs.setDate(new Date());
   gbAO.updateGoal(gs);
   System.out.println("Book Goal Updated Successfully with id="+gs.getGoalId()+","+gs.getDate()+","+gs.getBookId());
   GoalbyGenre gl=new GoalbyGenre();
   gl.setGoalId("G00Ix");
   gl.setGenre("Horror");
   GoalbgDAO gg=new GoalbgDAO();
   gg.createGoal(gl);
   System.out.println("Genre Added Successfully with id="+gl.getGoalId()+","+gl.getGenre()+","+gl.getUserId());
   gl.setUserId("ASPXDE");
   gg.updateGoal(gl);
   System.out.println("Genre Goal Updated Successfully with id="+gl.getUserId()+","+gl.getDate()+","+gl.getBookId());
   List<Goal>gfk=gDAO.readUserwise("akanksha123");
   for(Goal gm:gfk)
   {
       System.out.println("By Author"+gm.getBookId());
   }
 }
}
