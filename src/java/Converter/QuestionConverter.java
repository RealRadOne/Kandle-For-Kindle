/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Converter;
import Model.Question;
import com.mongodb.BasicDBObjectBuilder;
import com.mongodb.DBObject;
import org.bson.types.ObjectId;
/**
 *
 * @author Sakshi Sinha
 */
public class QuestionConverter 
{
   public static DBObject toDBObject(Question q) 
 {

		BasicDBObjectBuilder builder = BasicDBObjectBuilder.start();
		builder.append("QuizID",q.getQuizID());
                builder.append("QuestionID",q.getQuestionID());
                builder.append("Question",q.getQuestion());
                builder.append("Ans",q.getAns());
                builder.append("Option1",q.getOption1());
                builder.append("Option2",q.getOption2());
                builder.append("Option3",q.getOption3());
                builder.append("Option4",q.getOption4());
		return builder.get();
 }
 public static Question toQuestion(DBObject doc)throws NullPointerException
 {
		Question q= new Question();
		q.setQuizID((String)doc.get("QuizID"));
                q.setQuestion((String)doc.get("Question"));
                q.setAns((String)doc.get("Ans"));
                q.setOption1((String)doc.get("Option1"));
                q.setOption2((String)doc.get("Option2"));
                q.setOption3((String)doc.get("Option3"));
                q.setOption4((String)doc.get("Option4"));
                q.setQuestionID((String)doc.get("QuestionID"));
		return q;

	}
	 
}
