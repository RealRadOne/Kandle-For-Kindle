/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Converter;

import Model.Quiz;
import com.mongodb.BasicDBObjectBuilder;
import com.mongodb.DBObject;
import org.bson.types.ObjectId;
import java.util.Date;
import java.text.*;
import java.time.*;

/**
 *
 * @author Sakshi Sinha
 */
public class QuizConverter 
{
    
 //Convert User Object to MongoDBObject
 public static DBObject toDBObject(Quiz q) 
 {

		BasicDBObjectBuilder builder = BasicDBObjectBuilder.start();
		builder.append("QuizID",q.getQuizID());
                builder.append("QuizName",q.getQuizName());
                builder.append("AuthorID",q.getAuthorID());
                builder.append("Date",q.getDate());
                builder.append("Time",q.getTime());
                builder.append("BookID",q.getBookID());
		return builder.get();
 }
 public static Quiz toQuiz(DBObject doc)throws NullPointerException
 {
		Quiz q= new Quiz();
		q.setQuizID((String)doc.get("QuizID"));
                q.setQuizName((String)doc.get("QuizName"));
                q.setAuthorID((String)doc.get("AuthorID"));
                q.setDate((Date)doc.get("Date"));
                q.setTime((LocalDateTime)doc.get("Time"));
                q.setBookID((String)doc.get("BookID"));
		return q;

	}
	
}
