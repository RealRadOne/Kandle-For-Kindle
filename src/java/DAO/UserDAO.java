package DAO;
import Connect.*;
import Model.*;
import Converter.*;
import com.mongodb.BasicDBObject;
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

	public UserDAO()
        {
                Connection con=Connection.getConnection();
		this.col = con.mongo.getDB("Kandle").getCollection("User");
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
        public int checkStatus(User u)
       {
           DBObject query = new BasicDBObject();
           query.put("userName",u.getuserName());
	   DBObject data = this.col.findOne(query);
           try
           {
           if((String)data.get("userName")!=null && ((String)data.get("password")).equals((String)data.get("password")))
           {System.out.println("Name and password match");return(1);}
           if((String)data.get("userName")==null)
           {System.out.println("User Does Not exist");return(-1);}
           }
           catch(NullPointerException e)
           {
              System.out.println(e);
              System.out.println("User does not exist");
              return(-1);
           }
           return(0);
       }
}
