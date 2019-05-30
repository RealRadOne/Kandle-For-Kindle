 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;
import Model.Goal;
import java.util.List;

/**
 *
 * @author Akanksha
 */
public interface GoalUC {
    public void SetGoal(String [] values,String [] dates,String userid);
    public List<Goal> ViewGoals(String userid);
    public void CompleteGoal(Goal g);
    
}
