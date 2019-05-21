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
public class GoalbaDAO implements GoalDAO 
{
    private DBCollection col;

	public GoalbaDAO()
        {
                Connection con=Connection.getConnection();
		this.col = con.mongo.getDB("Kandle").getCollection("Goal");
	}
        //Creating the DB Entry
        public Goal createGoal(Goal g) 
        {
                GoalbyAuthor g1=(GoalbyAuthor) g;
		DBObject doc = GoalbyAuthorConverter.toDBObject(g1);
		this.col.insert(doc);
		String id = (String) doc.get("GoalID");
		g.setGoalId(id);
		return g;
	}
        //Updating the Entry
        public void updateGoal(Goal g) 
        {
            GoalbyAuthor g1=(GoalbyAuthor) g;
	    DBObject query = BasicDBObjectBuilder.start().append("GoalID", g.getGoalId()).get();
            this.col.update(query, GoalbyAuthorConverter.toDBObject(g1));
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
			Goal g= GoalbyAuthorConverter.toGoal(doc);
			data.add(g);
		}
		return data;
        }
}
