package Converter;
import Model.*;
import org.bson.types.ObjectId;
import com.mongodb.BasicDBObjectBuilder;
import com.mongodb.DBObject;
/**
 *
 * @author Sakshi Sinha
 */
public class BookConverter 
{
 //Convert User Object to MongoDBObject
 public static DBObject toDBObject(Book b) 
 {

		BasicDBObjectBuilder builder = BasicDBObjectBuilder.start();
		builder.append("_id",b.getBookId());
                builder.append("Name",b.getName());
                builder.append("KindlePoints",b.getKindlePoints());
		return builder.get();
 }
 public static Book toBook(DBObject doc) 
 {
		Book b= new Book();
		b.setName((String) doc.get("Name"));
		b.setKindlePoints((double) doc.get("KindlePoints"));
		ObjectId id = (ObjectId) doc.get("_id");
		b.setBookId(id.toString());
		return b;

	}
	
 
}

