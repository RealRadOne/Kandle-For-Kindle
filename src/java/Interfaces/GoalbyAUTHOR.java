/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import DAO.GoalbaDAO;
import DAO.GoalbgDAO;
import Model.GoalbyAuthor;
import Model.GoalbyGenre;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

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
                GoalbaDAO gDAO = new GoalbaDAO();
                gDAO.createGoal(g);
                System.out.println("goal created with "+g.getGoalId()+" "+g.getNum());
            } catch (ParseException ex) {
                Logger.getLogger(GoalbyAuthor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        }
}
