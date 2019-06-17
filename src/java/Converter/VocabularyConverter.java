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
public class VocabularyConverter 
{
//Convert User Object to MongoDBObject
 public static DBObject toDBObject(Vocabulary v) 
 {

		BasicDBObjectBuilder builder = BasicDBObjectBuilder.start();
                builder.append("_id",v.getId());
                builder.append("UserID",v.getUserId());
                builder.append("WordID",v.getWordId());
		return builder.get();
 }
 public static Vocabulary toVocabulary(DBObject doc)throws NullPointerException 
 {
		Vocabulary v= new Vocabulary();
		v.setUserId((String) doc.get("UserID"));
		v.setWordId((String) doc.get("WordID"));
		ObjectId id = (ObjectId) doc.get("_id");
                v.setId(id.toString());
		return v;

	}    
}
