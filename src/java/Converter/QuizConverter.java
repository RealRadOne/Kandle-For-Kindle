/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Converter;

import Model.Quiz;
import com.mongodb.BasicDBObjectBuilder;
import com.mongodb.DBObject;

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
                try
                {
		builder.append("QuizID",q.getQuizID());
                builder.append("QuizName",q.getQuizName());
                builder.append("AuthorID",q.getAuthorID());
                builder.append("Date",q.getDate());
                builder.append("Hour",q.getHour());
                builder.append("Second",q.getSecond());
                builder.append("Minute",q.getMinute());
                builder.append("BookID",q.getBookID());
                builder.append("UserID",q.getUserID());
                builder.append("Score",q.getScore());
                }
                catch(Exception e)
                {
                   System.out.println("Small error"); 
                }
                return builder.get();
 }
 public static Quiz toQuiz(DBObject doc)throws NullPointerException
 {
     Quiz q= new Quiz();
                try{
		q.setQuizID((String)doc.get("QuizID"));
                q.setQuizName((String)doc.get("QuizName"));
                q.setAuthorID((String)doc.get("AuthorID"));
                q.setDate((String)doc.get("Date"));
                q.setHour((int)doc.get("Hour"));
                q.setMinute((int)doc.get("Minute"));
                q.setSecond((int)doc.get("Second"));
                q.setBookID((String)doc.get("BookID"));
                q.setUserID((String)doc.get("UserID"));
                q.setScore((int)doc.get("Score"));
                }
                catch(Exception e)
                {
                    System.out.println("Small Error");
                }
		return q;
}	
}