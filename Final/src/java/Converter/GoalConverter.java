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
import org.bson.types.ObjectId;

/**
 *
 * @author Sakshi Sinha
 */
public class GoalConverter 
{
public static DBObject toDBObject(Goal g) 
 {

		BasicDBObjectBuilder builder = BasicDBObjectBuilder.start();
		builder.append("_id",g.getGoalId());
                builder.append("UserID",g.getUserId());
                builder.append("Date",g.getDate());
		return builder.get();
 }
 public static Goal toGoal(DBObject doc)throws NullPointerException
 {
		Goal g= new Goal();
                g.setUserId((String)doc.get("UserId"));
                g.setDate((Date)doc.get("Date"));
                ObjectId id = (ObjectId) doc.get("_id");
		g.setGoalId(id.toString());
		return g;

	}    
}
