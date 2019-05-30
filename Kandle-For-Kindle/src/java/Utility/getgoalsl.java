/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utility;
import DAO.GoalbaDAO;
import DAO.GoalbbDAO;
import java.util.List;

/**
 *
 * @author Akanksha
 */
public class getgoalsl {
    public static int getnumgoals(String userid){
        GoalbaDAO g1=new GoalbaDAO();
        GoalbbDAO g2=new GoalbbDAO();
        return ((g1.readUserwise(userid)).size()+(g2.readUserwise(userid)).size());
    }
    
}
