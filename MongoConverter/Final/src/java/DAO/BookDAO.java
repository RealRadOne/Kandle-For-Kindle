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
public class BookDAO 
{
  private DBCollection col;

	public BookDAO(MongoClient mongo)
        {
		this.col = mongo.getDB("Kandle").getCollection("Book");
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
 
}

