package DAO;
import Model.*;
import Converter.*;
import com.mongodb.BasicDBObject;
import java.util.List;
import java.util.ArrayList;
import java.util.Locale;
import org.bson.types.ObjectId;
import com.mongodb.BasicDBObjectBuilder;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import java.util.regex.*;
/**
 *
 * @author Sakshi Sinha
 */
public class AuthorDAO 
{
  private DBCollection col;

	public AuthorDAO(MongoClient mongo)
        {
		this.col = mongo.getDB("Kandle").getCollection("Author");
	}
        //Creating the DB Entry
        public Author createAuthor(Author a) 
        {
		DBObject doc = AuthorConverter.toDBObject(a);
		this.col.insert(doc);
		ObjectId id = (ObjectId) doc.get("_id");
		a.setId(id.toString());
		return a;
	}
        //Updating the Entry
        public void updateAuthor(Author a) 
        {
		DBObject query = BasicDBObjectBuilder.start().append("_id", new ObjectId(a.getId())).get();
		this.col.update(query, AuthorConverter.toDBObject(a));
	}
        //Reading all data from Document
        public List<Author> readAllAuthors() 
        {
		List<Author> data = new ArrayList<Author>();
		DBCursor cursor = col.find();
		while (cursor.hasNext()) 
                {
			DBObject doc = cursor.next();
			Author a= AuthorConverter.toAuthor(doc);
			data.add(a);
		}
		return data;
	}
        //Deleting document
       public void deleteAuthor(Author a) 
       {
		DBObject query = BasicDBObjectBuilder.start().append("_id", new ObjectId(a.getId())).get();
		this.col.remove(query);
       }
}


