package DAO;
import Model.*;
import Converter.*;
import java.util.List;
import java.util.ArrayList;
import org.bson.types.ObjectId;
import com.mongodb.BasicDBObjectBuilder;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
/**
 *
 * @author Sakshi Sinha
 */
public class UserDAO 
{
  private DBCollection col;

	public UserDAO(MongoClient mongo)
        {
		this.col = mongo.getDB("Kandle").getCollection("User");
	}
        //Creating the DB Entry
        public User createUser(User u) 
        {
		DBObject doc = UserConverter.toDBObject(u);
		this.col.insert(doc);
		ObjectId id = (ObjectId) doc.get("_id");
		u.setUserId(id.toString());
		return u;
	}
        //Updating the Entry
        public void updateUser(User u) 
        {
		DBObject query = BasicDBObjectBuilder.start().append("_id", new ObjectId(u.getUserId())).get();
		this.col.update(query, UserConverter.toDBObject(u));
	}
        //Reading all data from Document
        public List<User> readAllUser() 
        {
		List<User> data = new ArrayList<User>();
		DBCursor cursor = col.find();
		while (cursor.hasNext()) {
			DBObject doc = cursor.next();
			User u = UserConverter.toUser(doc);
			data.add(u);
		}
		return data;
	}
        //Deleting document
       public void deleteUser(User u) 
       {
		DBObject query = BasicDBObjectBuilder.start().append("_id", new ObjectId(u.getUserId())).get();
		this.col.remove(query);
	}
       public User readUser(User u) 
       {
		DBObject query = BasicDBObjectBuilder.start().append("_id", new ObjectId(u.getUserId())).get();
		DBObject data = this.col.findOne(query);
		return UserConverter.toUser(data);
	}
 
}
