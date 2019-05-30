package DAO;
import Model.*;
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
import com.mongodb.MongoClient;
import java.util.regex.*;
/**
 *
 * @author Sakshi Sinha
 */
public class BookDAO 
{
  private DBCollection col;

	public BookDAO()
        {
                Connection con=Connection.getConnection();
		this.col = con.mongo.getDB("Kandle").getCollection("Book");
	}
        //Creating the DB Entry
        public Book createBook(Book b) 
        {
		DBObject doc = BookConverter.toDBObject(b);
		this.col.insert(doc);
		ObjectId id = (ObjectId) doc.get("_id");
		b.setBookId(id.toString());
		return b;
	}
        //Updating the Entry
        public void updateBook(Book b) 
        {
		DBObject query = BasicDBObjectBuilder.start().append("_id", new ObjectId(b.getBookId())).get();
		this.col.update(query, BookConverter.toDBObject(b));
	}
        //Reading all data from Document
        public List<Book> readAllBooks() 
        {
		List<Book> data = new ArrayList<Book>();
		DBCursor cursor = col.find();
		while (cursor.hasNext()) 
                {
			DBObject doc = cursor.next();
			Book b = BookConverter.toBook(doc);
			data.add(b);
		}
		return data;
	}
        //Deleting document
       public void deleteBook(Book b) 
       {
		DBObject query = BasicDBObjectBuilder.start().append("_id", new ObjectId(b.getBookId())).get();
		this.col.remove(query);
	}
       public Book readBook(Book b) 
       {
		DBObject query = BasicDBObjectBuilder.start().append("_id", new ObjectId(b.getBookId())).get();
		DBObject data = this.col.findOne(query);
		return BookConverter.toBook(data);
	}
        public List<Book> GetBooks(String str) 
       {
                List<Book> data = new ArrayList<Book>();
		BasicDBObject query = new BasicDBObject();
		query.put("Name",Pattern.compile("^"+str));
                DBCursor cursor = col.find(query);
		while (cursor.hasNext()) 
                {
			DBObject doc = cursor.next();
			Book d= BookConverter.toBook(doc);
			data.add(d);
		}
		return data;
	}
        public Book GetthisBook(String str) 
       {
                List<Book> data = new ArrayList<Book>();
		BasicDBObject query = new BasicDBObject();
		query.put("Name",str);
                Book d=new Book();
                DBCursor cursor = col.find(query);
		while (cursor.hasNext()) 
                {
			DBObject doc = cursor.next();
			d= BookConverter.toBook(doc);
			
		}
		return d;
	}
 
}

