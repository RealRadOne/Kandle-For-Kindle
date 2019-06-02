package DAO;
import java.util.*;
import Connect.*;
import Converter.QuizConverter;
import Model.Quiz;
import Model.Author;
import com.mongodb.BasicDBObject;
import com.mongodb.BasicDBObjectBuilder;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.DBCursor;

/**
 *
 * @author Sakshi Sinha
 */
public class QuizDAO 
{
   private DBCollection col;

	public QuizDAO()
        {
                Connection con=Connection.getConnection();
		this.col = con.mongo.getDB("Kandle").getCollection("Quiz");
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
        public Quiz FindQuiz(String QuizID)
        {
           DBObject query=new BasicDBObject();
           query.put("QuizID",QuizID);
           DBObject doc=col.findOne(query);
           Quiz q=QuizConverter.toQuiz(doc);
           return(q);
        }
        //Updating the Entry
        public void updateQuiz(Quiz q) 
        {
		DBObject query = BasicDBObjectBuilder.start().append("QuizID", q.getQuizID()).get();
		this.col.update(query, QuizConverter.toDBObject(q));
	}
        
        public List<Quiz> readAllQuiz()
        {
            
		List<Quiz> data = new ArrayList<Quiz>();
		DBCursor cursor = col.find();
		while (cursor.hasNext()) {
			DBObject doc = cursor.next();
			Quiz q= QuizConverter.toQuiz(doc);
			data.add(q);
		}
		return data;
        }
        public Author FetchAuthor(Quiz q)
        {
            String Autho=q.getAuthorID();
            AuthorDAO auko=new AuthorDAO();
            Author aura=auko.findAuthor(Autho);
            return(aura);
        }
        public List<Quiz> findByAuthor(String AuthName)
        {
            AuthorDAO ask=new AuthorDAO();
            List<Quiz> result=new ArrayList<Quiz>();
            try
            {
            Author ak=ask.findAuthor(AuthName);
            DBObject query=new BasicDBObject();
            query.put("AuthorID",ak.getAuthorID());
            DBCursor cursor = col.find(query);
            while(cursor.hasNext())
            {
               DBObject doc = cursor.next();
	       Quiz q= QuizConverter.toQuiz(doc);
	       result.add(q);
            }
            }
            catch(Exception e)
            {
                System.out.println("Just an error");
            }
            return(result);
            }
        public List<Quiz> findByUser(String UserID)
        {
            List<Quiz>result=new ArrayList<Quiz>();
            try
            {
            DBObject query=new BasicDBObject();
            query.put("UserID",UserID);
            DBCursor cursor=col.find(query);
            while(cursor.hasNext())
            {
                DBObject doc=cursor.next();
                Quiz q=QuizConverter.toQuiz(doc);
                result.add(q);
            }
            }
            catch(Exception e)
            {
                System.out.println("Just Empty Problems");
            }
            return(result);
        }
        public List<Quiz> UsersByQuiz(String QuizID)
        {
            List<Quiz>data=new ArrayList<Quiz>();
            try
            {
                DBObject query=new BasicDBObject();
                query.put("QuizID",QuizID);
                DBCursor cursor=col.find(query);
                while(cursor.hasNext())
                {
                DBObject doc=cursor.next();
                Quiz q=QuizConverter.toQuiz(doc);
                data.add(q); 
                }
            }
            catch(Exception e)
            {System.out.println("");}
            return(data);
        }
        
      //Sorting By Score for the LeaderBoard
      public List<Quiz> SortByUsers(String QuizID)
      {
          List<Quiz>data=new ArrayList<Quiz>();
          try
          {
              DBObject query=new BasicDBObject();
              query.put("QuizID",QuizID);
              DBCursor cursor=col.find(query);
              while(cursor.hasNext())
              {
               DBObject doc=cursor.next();
               Quiz q=QuizConverter.toQuiz(doc);
               data.add(q);
              }
              
             Comparator<Quiz> compareByScore = new Comparator<Quiz>() 
             {
             @Override
             public int compare(Quiz q1, Quiz q2) 
             {
             if(q1.getScore()>q2.getScore())
                 return -1;
             else if(q1.getScore()==q2.getScore())
                 return 0;
             else
                 return 1;
             }
             };
             Collections.sort(data,compareByScore);
          }
          catch(Exception e)
          {
              System.out.println(e.fillInStackTrace());
          }
          return(data);
      }
      
      //Getting UserWise Total Score for a certain UserID
      public int UtotScore(String UserID)
      {
          QuizDAO qd=new QuizDAO();
          List<Quiz>enrl=qd.findByUser(UserID);
          int sum=0;
          try
          {
          for(Quiz qk:enrl)
          {
              sum=sum+qk.getScore();
          }
          }
          catch(Exception e)
          {
             System.out.println(e.getMessage());
          }
          return(sum);
      }
}
