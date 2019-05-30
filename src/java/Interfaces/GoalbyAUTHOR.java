/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import DAO.GoalbaDAO;
import DAO.GoalbgDAO;
import Model.Goal;
import Model.GoalbyAuthor;
import Model.GoalbyGenre;
import DAO.UserDAO;
import Model.User;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.List;

/**
 *
 * @author Akanksha
 */
public class GoalbyAUTHOR implements GoalUC{
    public void SetGoal(String[] Values, String[] Dates, String userid) {
        for(int i=0;i<Values.length;i++){
            try {
                GoalbyAuthor g=new GoalbyAuthor();
                String [] temp=Values[i].split(" ");
                g.setUserId(userid);
                g.setAuthorId(temp[0]);
                System.out.print(temp[1]);
                g.setNum(Integer.parseInt(temp[1]));
                Date date1=new SimpleDateFormat("yyyy-MM-dd").parse(Dates[i]);
                g.setDate(date1);
                g.setType("AUTHOR");
                g.setStatus("Incomplete");
                 //System.out.print(g.getStatus());
                GoalbaDAO gDAO = new GoalbaDAO();
                gDAO.createGoal(g);
                System.out.println("goal created with "+g.getGoalId()+" "+g.getNum()+g.getStatus());
            } catch (ParseException ex) {
                Logger.getLogger(GoalbyAuthor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        }
    public List<Goal> ViewGoals(String userid){
        GoalbaDAO gDAO=new GoalbaDAO();
        List<Goal> data = new ArrayList<Goal>();
        data=gDAO.readUserwise(userid);
        return data;
    }
    public void CompleteGoal(Goal g){
        GoalbyAuthor ga=(GoalbyAuthor)g;
        User u=new User();
        u.setUserId(ga.getUserId());
        UserDAO obj=new UserDAO();
        u=obj.readUser(u);
        if(ga.getNum()>2){
            u.setKindlePoints(u.getKindlePoints()+20);
        }
        else if(ga.getNum()>1){
            u.setKindlePoints(u.getKindlePoints()+15);
        }
        else{
            u.setKindlePoints(u.getKindlePoints()+10);
        }
        obj.updateUser(u);
        
        ga.setStatus("Complete");
        GoalbaDAO gobj=new GoalbaDAO();
        gobj.updateGoal(ga);
        System.out.println("Goal Completed");
    }
}
