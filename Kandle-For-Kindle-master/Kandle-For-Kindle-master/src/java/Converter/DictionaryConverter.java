/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Converter;

import Model.*;
import com.mongodb.BasicDBObjectBuilder;
import com.mongodb.DBObject;
import org.bson.types.ObjectId;

/**
 *
 * @author Sakshi Sinha
 */
public class DictionaryConverter 
{
//Convert User Object to MongoDBObject
 public static DBObject toDBObject(Dictionary d) 
 {

		BasicDBObjectBuilder builder = BasicDBObjectBuilder.start();
                builder.append("WordID",d.getWordId());
                builder.append("Word",d.getWord());
                builder.append("Meaning",d.getMeaning());
		return builder.get();
 }
 public static Dictionary toDictionary(DBObject doc) 
 {
		Dictionary d= new Dictionary();
		d.setWord((String) doc.get("Word"));
                d.setMeaning((String)doc.get("Meaning"));
		//(ObjectId)doc.get("ID");
                d.setWordId((String)doc.get("WordID"));
		return d;

	}    
}
