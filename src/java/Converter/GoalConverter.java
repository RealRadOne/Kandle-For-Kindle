/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Converter;

import Model.Goal;
import com.mongodb.BasicDBObjectBuilder;
import com.mongodb.DBObject;
import java.util.Date;

/**
 *
 * @author Sakshi Sinha
 */
public class GoalConverter 
{
public static DBObject toDBObject(Goal g) 
 {

	BasicDBObjectBuilder builder = BasicDBObjectBuilder.start();
	builder.append("GoalID",g.getGoalId());
        builder.append("UserID",g.getUserId());
        builder.append("Date",g.getDate());
        builder.append("BookID",g.getBookId());
		return builder.get();
 }
 public static Goal toGoal(DBObject doc)throws NullPointerException
 {
		Goal g= new Goal();
                g.setUserId((String)doc.get("UserID"));
                g.setDate((Date)doc.get("Date"));
                g.setBookId((String)doc.get("BookID"));
                g.setGoalId((String)doc.get("GoalID"));
		return g;

	}    
}
