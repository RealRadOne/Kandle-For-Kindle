package Converter;
import Model.User;
import com.mongodb.BasicDBObjectBuilder;
import com.mongodb.DBObject;
/**
 *
 * @author Sakshi Sinha
 */
public class UserConverter 
{
 //Convert User Object to MongoDBObject
 public static DBObject toDBObject(User u) 
 {

		BasicDBObjectBuilder builder = BasicDBObjectBuilder.start();
                builder.append("Level",u.getLevel());
                builder.append("KindlePoints",u.getKindlePoints());
                builder.append("UserName",u.getUserName());
                builder.append("UserID",u.getUserId());
                builder.append("Password",u.getPassword());
                builder.append("Email",u.getEmail());
		return builder.get();
 }
 public static User toUser(DBObject doc) 
 {
		User u = new User();
		u.setLevel((String) doc.get("Level"));
		u.setKindlePoints((Double)doc.get("KindlePoints"));
                u.setUserName((String)doc.get("UserName"));
                u.setUserId((String)doc.get("UserID"));
                u.setPassword((String)doc.get("Password"));
                u.setEmail((String)doc.get("Email"));
		return u;

	}
	
 
}