package DAO;
import Model.Author;
import Connect.*;
import Converter.*;
import com.mongodb.BasicDBObject;
import java.util.List;
import java.util.ArrayList;
import org.bson.types.ObjectId;
import com.mongodb.BasicDBObjectBuilder;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
/**
 *
 * @author Sakshi Sinha
 */
public class AuthorDAO 
{
  private DBCollection col;

	public AuthorDAO()
        {
            Connection con=Connection.getConnection();
            this.col=con.mongo.getDB("Kandle").getCollection("Author");
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
       public int checkStatus(Author as)
       {
           DBObject query = new BasicDBObject();
           query.put("userName",as.getName());
	   DBObject data = this.col.findOne(query);
           try
           {
           if((String)data.get("authorName")!=null && ((String)data.get("password")).equals((String)data.get("password")))
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
       public Author findAuthor(String Author)
       {
           DBObject query=new BasicDBObject();
           query.put("Name",Author);
           DBObject data=this.col.findOne(query);
           Author ak=AuthorConverter.toAuthor(data);
           return ak;
       }
}


