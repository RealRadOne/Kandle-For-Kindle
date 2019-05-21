/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;
import Model.*;
import Converter.*;
import DAO.*;
import Utility.*;
import com.mongodb.MongoClient;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.*;
import javax.servlet.http.*;
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
                GoalbbDAO gDAO = new GoalbbDAO();
                gDAO.createGoal(g);
                System.out.println("goal created");
            } catch (ParseException ex) {
                Logger.getLogger(GoalbyBOOK.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        }
    
}
