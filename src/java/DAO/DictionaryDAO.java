package DAO;
import Connect.Connection;
import Model.*;
import Converter.*;
import java.util.List;
import java.util.ArrayList;
import org.bson.types.ObjectId;
import com.mongodb.BasicDBObject;
import com.mongodb.BasicDBObjectBuilder;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
/**
 *
 * @author Sakshi Sinha
 */
public class DictionaryDAO 
{
  private DBCollection col;

	public DictionaryDAO()
        {
                Connection con=Connection.getConnection();
		this.col = con.mongo.getDB("Kandle").getCollection("Dictionary");
	}
        //Creating the DB Entry
        public Dictionary createDictionary(Dictionary d) 
        {
		DBObject doc = DictionaryConverter.toDBObject(d);
		this.col.insert(doc);
		ObjectId id = (ObjectId) doc.get("_id");
		d.setWordId(id.toString());
		return d;
	}
        //Updating the Entry
        public void updateDictionary(Dictionary d) 
        {
		DBObject query = BasicDBObjectBuilder.start().append("_id", new ObjectId(d.getWordId())).get();
		this.col.update(query, DictionaryConverter.toDBObject(d));
	}
        //Reading all data from Document
        public List<Dictionary> readAllWords() 
        {
		List<Dictionary> data = new ArrayList<Dictionary>();
		DBCursor cursor = col.find();
		while (cursor.hasNext()) {
			DBObject doc = cursor.next();
			Dictionary d= DictionaryConverter.toDictionary(doc);
			data.add(d);
		}
		return data;
	}
        //Deleting document
       public void deleteDictionary(Dictionary d) 
       {
		DBObject query = BasicDBObjectBuilder.start().append("_id", new ObjectId(d.getWordId())).get();
		this.col.remove(query);
	}
       public List<Dictionary> readWords(Dictionary dd) 
       {
                List<Dictionary> data = new ArrayList<Dictionary>();
		BasicDBObject query = new BasicDBObject();
		query.put("WordID",dd.getWordId());
                DBCursor cursor = col.find(query);
		while (cursor.hasNext()) 
                {
			DBObject doc = cursor.next();
			Dictionary d= DictionaryConverter.toDictionary(doc);
			data.add(d);
		}
		return data;
	}
 
}

