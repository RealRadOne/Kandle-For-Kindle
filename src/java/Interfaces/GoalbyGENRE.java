/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import DAO.*;
import Model.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Akanksha
 */
public class GoalbyGENRE implements GoalUC{
    public void SetGoal(String[] Values, String[] Dates, String userid) {
        for(int i=0;i<Values.length;i++){
            try {
                GoalbyGenre g=new GoalbyGenre();
                String [] temp=Values[i].split(" ");
                g.setUserId(userid);
                g.setGenre(temp[0]);
                g.setNum(Integer.parseInt(temp[1]));
                Date date1=new SimpleDateFormat("yyyy-MM-dd").parse(Dates[i]);
                g.setDate(date1);
                GoalbgDAO gDAO = new GoalbgDAO();
                gDAO.createGoal(g);
                System.out.println("goal created");
            } catch (ParseException ex) {
                Logger.getLogger(GoalbyGenre.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        }
}
