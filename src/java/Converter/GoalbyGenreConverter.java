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
public class GoalbyGenreConverter {
    public static DBObject toDBObject(GoalbyGenre g) 
 {

	BasicDBObjectBuilder builder = BasicDBObjectBuilder.start();
	builder.append("GoalID",g.getGoalId());
        builder.append("UserID",g.getUserId());
        builder.append("Date",g.getDate());
        builder.append("AuthorId",g.getGenre());
        builder.append("Num",g.getNum());
		return builder.get();
 }
 public static GoalbyGenre toGoal(DBObject doc)throws NullPointerException
 {
		GoalbyGenre g= new GoalbyGenre();
                g.setUserId((String)doc.get("UserId"));
                g.setDate((Date)doc.get("Date"));
                g.setGenre((String)doc.get("Genre"));
                g.setNum((int)doc.get("Num"));
		g.setGoalId((String)doc.get("GoalID"));
		return g;

	}    
}
