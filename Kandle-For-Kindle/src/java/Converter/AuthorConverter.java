package Converter;
import Model.*;
import org.bson.types.ObjectId;
import com.mongodb.BasicDBObjectBuilder;
import com.mongodb.DBObject;
/**
 *
 * @author Sakshi Sinha
 */
public class AuthorConverter 
{
 //Convert User Object to MongoDBObject
 public static DBObject toDBObject(Author a) 
 {

		BasicDBObjectBuilder builder = BasicDBObjectBuilder.start();
                builder.append("_id",a.getId());
		builder.append("AuthorID",a.getAuthorID());
                builder.append("Name",a.getName());
                builder.append("Password",a.getPassword());
                builder.append("Email",a.getEmail());
		return builder.get();
 }
 public static Author toAuthor(DBObject doc)throws NullPointerException
 {
		Author a =new Author();
		a.setName((String) doc.get("Name"));
                a.setAuthorID((String)doc.get("AuthorID"));
                a.setPassword((String)doc.get("Password"));
                a.setEmail((String)doc.get("Email"));
		ObjectId id = (ObjectId) doc.get("_id");
		a.setId(id.toString());
		return a;

	}
	
 
}


