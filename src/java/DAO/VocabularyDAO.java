package DAO;
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
public class VocabularyDAO 
{
  private DBCollection col;

	public VocabularyDAO(MongoClient mongo)
        {
		this.col = mongo.getDB("Kandle").getCollection("Vocabulary");
	}
        //Creating the DB Entry
        public Vocabulary createVocabulary(Vocabulary v) 
        {
		DBObject doc = VocabularyConverter.toDBObject(v);
		this.col.insert(doc);
		ObjectId id = (ObjectId) doc.get("_id");
		v.setId(id.toString());
		return v;
	}
        //Updating the Entry
        public void updateVocabulary(Vocabulary v) 
        {
		DBObject query = BasicDBObjectBuilder.start().append("_id", new ObjectId(v.getId())).get();
		this.col.update(query, VocabularyConverter.toDBObject(v));
	}
        //Reading all data from Document
        public List<Vocabulary> readAllVocabulary() 
        {
		List<Vocabulary> data = new ArrayList<Vocabulary>();
		DBCursor cursor = col.find();
		while (cursor.hasNext()) {
			DBObject doc = cursor.next();
			Vocabulary v = VocabularyConverter.toVocabulary(doc);
			data.add(v);
		}
		return data;
	}
        //Deleting document
       public void deleteVocabulary(Vocabulary v) 
       {
		DBObject query = BasicDBObjectBuilder.start().append("_id", new ObjectId(v.getId())).get();
		this.col.remove(query);
	}
       public List<Vocabulary> readVocabulary(String UserID) 
       {
                List<Vocabulary> data = new ArrayList<Vocabulary>();
		BasicDBObject query = new BasicDBObject();
		query.put("UserID",UserID);
                DBCursor cursor = col.find(query);
		while (cursor.hasNext()) 
                {
			DBObject doc = cursor.next();
			Vocabulary v = VocabularyConverter.toVocabulary(doc);
			data.add(v);
		}
		return data;
	}
 
}

