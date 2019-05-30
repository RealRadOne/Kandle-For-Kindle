/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Converter;
import Model.*;
import com.mongodb.BasicDBObjectBuilder;
import com.mongodb.DBObject;
import java.util.Date;
import org.bson.types.ObjectId;
/**
 *
 * @author Akanksha
 */
public class GoalbyBookConverter 
{
    public static DBObject toDBObject(GoalbyBook g) 
 {

        BasicDBObjectBuilder builder = BasicDBObjectBuilder.start();
	builder.append("GoalID",g.getGoalId());
        builder.append("UserID",g.getUserId());
        builder.append("Date",g.getDate());
        builder.append("BookID",g.getBookID());
		return builder.get();
 }
 public static GoalbyBook toGoal(DBObject doc)throws NullPointerException
 {
		GoalbyBook g= new GoalbyBook();
                g.setUserId((String)doc.get("UserId"));
                g.setDate((Date)doc.get("Date"));
                g.setBookID((String)doc.get("BookID"));
                g.setGoalId((String) doc.get("GoalID"));
		return g;

}    
}
