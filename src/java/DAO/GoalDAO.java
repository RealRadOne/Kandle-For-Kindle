/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import Connect.Connection;
import Model.Goal;
import Converter.GoalConverter;
import com.mongodb.BasicDBObjectBuilder;
import org.bson.types.ObjectId;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.BasicDBObject;
import com.mongodb.DBCursor;
/**
 *
 * @author Sakshi Sinha
 */
public class GoalDAO 
{
   //Convert User Object to MongoDBObject
   private DBCollection col;

	public GoalDAO()
        {
                Connection con=Connection.getConnection();
		this.col = con.mongo.getDB("Kandle").getCollection("Goal");
	}
        //Creating the DB Entry
        public Goal createGoal(Goal g) 
        {
		DBObject doc = GoalConverter.toDBObject(g);
		this.col.insert(doc);
		ObjectId id = (ObjectId) doc.get("_id");
		g.setGoalId(id.toString());
		return g;
	}
        //Updating the Entry
        public void updateGoal(Goal g) 
        {
		DBObject query = BasicDBObjectBuilder.start().append("_id", g.getGoalId()).get();
		this.col.update(query, GoalConverter.toDBObject(g));
	} 
        public List<Goal> readUserwise(String UserID)
        {
            List<Goal> data = new ArrayList<Goal>();
		BasicDBObject query = new BasicDBObject();
		query.put("UserID",UserID);
                DBCursor cursor = col.find(query);
		while (cursor.hasNext()) 
                {
			DBObject doc = cursor.next();
			Goal g= GoalConverter.toGoal(doc);
			data.add(g);
		}
		return data;
        }
}
