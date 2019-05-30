package DAO;
import Connect.*;
import Model.User;
import Converter.UserConverter;
import com.mongodb.BasicDBObject;
import java.util.List;
import java.util.ArrayList;
import com.mongodb.BasicDBObjectBuilder;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
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
    String UserID = (String) doc.get("UserID");
    u.setUserId(UserID);
    return u;
  }
        //Updating the Entry
        public void updateUser(User u) 
        {
    DBObject query = BasicDBObjectBuilder.start().append("UserID",u.getUserId()).get();
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
       public void deleteUser(String UserID) 
       {
    DBObject query = BasicDBObjectBuilder.start().append("UserID",UserID).get();
    this.col.remove(query);
  }
       public User readUserById(String UserID) 
       {
    DBObject query = BasicDBObjectBuilder.start().append("UserID",UserID).get();
    DBObject data = this.col.findOne(query);
    return UserConverter.toUser(data);
  }
        public int checkStatus(User u)
       {
           DBObject query = new BasicDBObject();
           query.put("UserID",u.getUserId());
     DBObject data = this.col.findOne(query);
           try
           {
           if((String)data.get("UserID")!=null && ((String)data.get("Password")).equals(u.getPassword()))
           {System.out.println("ID and password match");return(1);}
           if((String)data.get("UserID")==null)
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
       public User readUser(User u) 
       {
    DBObject query = BasicDBObjectBuilder.start().append("UserID", u.getUserId()).get();
    DBObject data = this.col.findOne(query);
    User u1=UserConverter.toUser(data);
                return u1;
  }
}
