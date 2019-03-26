/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Converter.QuestionConverter;
import Model.Question;
import com.mongodb.BasicDBObject;
import com.mongodb.BasicDBObjectBuilder;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import java.util.ArrayList;
import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author Sakshi Sinha
 */
public class QuestionDAO 
{
 private DBCollection col;

	public QuestionDAO(MongoClient mongo)
        {
		this.col = mongo.getDB("Kandle").getCollection("Question");
	}
        //Creating the DB Entry
        public Question createQuestion(Question q) 
        {
		DBObject doc = QuestionConverter.toDBObject(q);
		this.col.insert(doc);
		ObjectId id = (ObjectId) doc.get("_id");
		q.setQuestionID(id.toString());
		return q;
	}
        //Updating the Entry
        public void updateQuestion(Question q) 
        {
		DBObject query = BasicDBObjectBuilder.start().append("_id", new ObjectId(q.getQuestionID())).get();
		this.col.update(query, QuestionConverter.toDBObject(q));
	}
        //Reading all data from Document
        public List<Question> readAllQuestions() 
        {
		List<Question> data = new ArrayList<Question>();
		DBCursor cursor = col.find();
		while (cursor.hasNext()) {
			DBObject doc = cursor.next();
			Question q= QuestionConverter.toQuestion(doc);
			data.add(q);
		}
		return data;
	}
        //Deleting document
       public void deleteQuestion(Question q) 
       {
		DBObject query = BasicDBObjectBuilder.start().append("_id", new ObjectId(q.getQuestionID())).get();
		this.col.remove(query);
	}
}
