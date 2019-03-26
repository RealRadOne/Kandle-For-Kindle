/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Converter.BookConverter;
import Converter.QuizConverter;
import Model.Quiz;
import com.mongodb.BasicDBObjectBuilder;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import org.bson.types.ObjectId;

/**
 *
 * @author Sakshi Sinha
 */
public class QuizDAO 
{
   private DBCollection col;

	public QuizDAO(MongoClient mongo)
        {
		this.col = mongo.getDB("Kandle").getCollection("Quiz");
	}
        //Creating the DB Entry
        public Quiz createQuiz(Quiz q) 
        {
		DBObject doc = QuizConverter.toDBObject(q);
		this.col.insert(doc);
		String QuizID = (String) doc.get("QuizID");
		q.setQuizID(QuizID);
		return q;
	}
        //Updating the Entry
        public void updateQuiz(Quiz q) 
        {
		DBObject query = BasicDBObjectBuilder.start().append("QuizID", q.getQuizID()).get();
		this.col.update(query, QuizConverter.toDBObject(q));
	} 
}
