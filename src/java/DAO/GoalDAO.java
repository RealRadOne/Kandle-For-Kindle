/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import Model.Goal;
import java.util.List;
/**
 *
 * @author Sakshi Sinha
 */
public interface GoalDAO 
{
  
        public Goal createGoal(Goal g);
        public void updateGoal(Goal g);
        public List<Goal> readUserwise(String UserID);   
}
