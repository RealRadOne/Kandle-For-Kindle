/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import Connect.Connection;
import Model.*;
import Converter.*;
import com.mongodb.BasicDBObjectBuilder;
import org.bson.types.ObjectId;
import java.util.List;
import java.util.ArrayList;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.BasicDBObject;
import com.mongodb.DBCursor;
/**
 *
 * @author Akanksha
 */
public class GoalbgDAO implements GoalDAO{
   private DBCollection col;

	public GoalbgDAO()
        {
                Connection con=Connection.getConnection();
		this.col = con.mongo.getDB("Kandle").getCollection("Goal");
	}
        //Creating the DB Entry
        public Goal createGoal(Goal g) 
        {
            GoalbyGenre g1=(GoalbyGenre) g;
		DBObject doc = GoalbyGenreConverter.toDBObject(g1);
		this.col.insert(doc);
		String id = (String) doc.get("GoalID");
		g.setGoalId(id);
		return g;
	}
        //Updating the Entry
        public void updateGoal(Goal g) 
        {
            GoalbyGenre g1=(GoalbyGenre) g;
		DBObject query = BasicDBObjectBuilder.start().append("GoalID", g.getGoalId()).get();
		this.col.update(query, GoalbyGenreConverter.toDBObject(g1));
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
			Goal g= GoalbyGenreConverter.toGoal(doc);
			data.add(g);
		}
		return data;
        } 
}
