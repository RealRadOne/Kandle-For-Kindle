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
public class GoalbbDAO implements GoalDAO {
    private DBCollection col;

	public GoalbbDAO()
        {
                Connection con=Connection.getConnection();
		this.col = con.mongo.getDB("Kandle").getCollection("Goal");
	}
        //Creating the DB Entry
        public Goal createGoal(Goal g) 
        {
            GoalbyBook g1=(GoalbyBook) g;
		DBObject doc = GoalbyBookConverter.toDBObject(g1);
		this.col.insert(doc);
		ObjectId id = (ObjectId) doc.get("_id");
		g.setGoalId(id.toString());
		return g;
	}
        //Updating the Entry
        public void updateGoal(Goal g) 
        {
            GoalbyBook g1=(GoalbyBook) g;
		DBObject query = BasicDBObjectBuilder.start().append("_id", new ObjectId(g.getGoalId())).get();
		this.col.update(query, GoalbyBookConverter.toDBObjectu(g1));
	} 
        public Goal readGoal(Goal b) 
       {
		DBObject query = BasicDBObjectBuilder.start().append("_id", new ObjectId(b.getGoalId())).get();
		DBObject data = this.col.findOne(query);
		Goal b1= GoalbyBookConverter.toGoal(data);
                if(b1.getType().equals("BOOK"))
                    return b1;
                else
                    return null;
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
			Goal g= GoalbyBookConverter.toGoal(doc);
                        //if(g.getType().equals("BOOK"))
                        if(g.getType()!=null && g.getStatus().equals("Incomplete"))
                            data.add(g);
			
		}
		return data;
        }
}
