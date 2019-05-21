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
/**
 *
 * @author Akanksha
 */
public class GoalbyAuthorConverter {
    public static DBObject toDBObject(GoalbyAuthor g) 
 {

	BasicDBObjectBuilder builder = BasicDBObjectBuilder.start();
	builder.append("GoalID",g.getGoalId());
        builder.append("UserID",g.getUserId());
        builder.append("Date",g.getDate());
        builder.append("AuthorId",g.getAuthorId());
        builder.append("Num",g.getNum());
	return builder.get();
 }
 public static GoalbyAuthor toGoal(DBObject doc)throws NullPointerException
 {
		GoalbyAuthor g= new GoalbyAuthor();
                g.setUserId((String)doc.get("UserId"));
                g.setDate((Date)doc.get("Date"));
                g.setAuthorId((String)doc.get("AuthorId"));
                g.setNum((int)doc.get("Num"));
		g.setGoalId((String)doc.get("GoalID"));
		return g;

	}    
}
