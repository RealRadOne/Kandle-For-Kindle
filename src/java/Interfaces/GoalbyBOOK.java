/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;
import Model.*;
import Converter.*;
import DAO.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Akanksha
 */
public class GoalbyBOOK implements GoalUC {

    @Override
    public void SetGoal(String[] Values, String[] Dates, String userid) {
        for(int i=0;i<Values.length;i++){
            try {
                GoalbyBook g=new GoalbyBook();
                g.setUserId(userid);
                g.setBookID(Values[i]);
                Date date1=new SimpleDateFormat("yyyy-MM-dd").parse(Dates[i]);
                g.setDate(date1);
                g.setType("BOOK");
                g.setStatus("Incomplete");
                GoalbbDAO gDAO = new GoalbbDAO();
                gDAO.createGoal(g);
                System.out.println("goal created");
            } catch (ParseException ex) {
                Logger.getLogger(GoalbyBOOK.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        }
    public List<Goal> ViewGoals(String userid){
        GoalbbDAO gDAO=new GoalbbDAO();
        List<Goal> data = new ArrayList<Goal>();
        data=gDAO.readUserwise(userid);
        return data;
    }
    public void CompleteGoal(Goal g){
        GoalbyBook ga=(GoalbyBook)g;
        System.out.println("Userid:"+ga.getUserId()+" , goal id"+ga.getGoalId());
        User u=new User();
        u.setUserId(ga.getUserId());
        Book b=new Book();
        b.setBookId(ga.getBookID());
        BookDAO bobj=new BookDAO(); 
        b=bobj.readBook(b);
        UserDAO obj=new UserDAO();
       // System.out.println("Userid:"+u.getUserId());
        u=obj.readUser(u);
        u.setKindlePoints(u.getKindlePoints()+b.getKindlePoints());
        obj.updateUser(u);
        ga.setStatus("Complete");
        GoalbbDAO gobj=new GoalbbDAO();
        gobj.updateGoal(ga);
        System.out.println("Goal Completed");
    }
    
}
