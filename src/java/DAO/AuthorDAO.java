package DAO;
import Model.*;
import Connect.*;
import Converter.*;
import com.mongodb.BasicDBObject;
import java.util.List;
import java.util.ArrayList;
import com.mongodb.BasicDBObjectBuilder;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import java.util.regex.*;
/**
 *
 * @author Sakshi Sinha
 */
public class AuthorDAO 
{
  private DBCollection col;

	public AuthorDAO()
        {
            Connection con=Connection.getConnection();
            this.col=con.mongo.getDB("Kandle").getCollection("Author");
		//this.col = mongo.getDB("Kandle").getCollection("Author");
	}
        //Creating the DB Entry
        public Author createAuthor(Author a) 
        {
		DBObject doc = AuthorConverter.toDBObject(a);
		this.col.insert(doc);
		String id = (String) doc.get("AuthorID");
		a.setAuthorID(id);
		return a;
	}
        //Updating the Entry
        public void updateAuthor(Author a) 
        {
		DBObject query = BasicDBObjectBuilder.start().append("AuthorID",a.getAuthorID()).get();
                this.col.update(query, AuthorConverter.toDBObject(a));
	}
        //Reading all data from Document
        public List<Author> readAllAuthors() 
        {
		List<Author> data = new ArrayList<Author>();
		DBCursor cursor = col.find();
		while (cursor.hasNext()) 
                {
			DBObject doc = cursor.next();
			Author a= AuthorConverter.toAuthor(doc);
			data.add(a);
		}
		return data;
	}
        //Deleting document
        public List<Author> GetAuthors(String str) 
       {
                List<Author> data = new ArrayList<Author>();
		BasicDBObject query = new BasicDBObject();
		query.put("Name",Pattern.compile(("^"+str),Pattern.CASE_INSENSITIVE));
                DBCursor cursor = col.find(query);
		while (cursor.hasNext()) 
                {
			DBObject doc = cursor.next();
			Author d= AuthorConverter.toAuthor(doc);
			data.add(d);
		}
		return data;
	}
       public void deleteAuthor(Author a) 
       {
		DBObject query = BasicDBObjectBuilder.start().append("AuthorID",a.getAuthorID()).get();
                this.col.remove(query);
       }
       public Author GetthisAuthor(String str) 
       {
                List<Author> data = new ArrayList<Author>();
		BasicDBObject query = new BasicDBObject();
		query.put("Name",str);
                Author d=new Author();
                DBCursor cursor = col.find(query);
		while (cursor.hasNext()) 
                {
			DBObject doc = cursor.next();
			d= AuthorConverter.toAuthor(doc);
			
		}
		return d;
	}
       public int checkStatus(Author as)
       {
           DBObject query = new BasicDBObject();
           query.put("AuthorID",as.getAuthorID());
	   DBObject data = this.col.findOne(query);
           try
           {
           if((String)data.get("AuthorID")!=null && ((String)data.get("Password")).equals(as.getPassword()))
           {System.out.println("Name and password match");return(1);}
           if((String)data.get("AuthorID")==null)
           {System.out.println("Author Does Not exist");return(-1);}
           }
           catch(NullPointerException e)
           {
              System.out.println(e);
              System.out.println("Author does not exist");
              return(-1);
           }
           return(0);
       }
       public Author findAuthor(String AuthorID)
       {
           Author as=new Author();
           String AuthName="bfg";
           String AuthID="abs";
           try
           {
           DBObject query=new BasicDBObject();
           query.put("AuthorID",AuthorID);
           DBObject data=this.col.findOne(query);
           as=AuthorConverter.toAuthor(data);
           AuthName=as.getName();
           AuthID=as.getAuthorID();
           }
           catch(Exception e)
           {
               System.out.println(AuthName+"**"+AuthID);
           }
           return(as);
       }
       public int totKonnects(String AuthorID)
       {
           QuizDAO qd=new QuizDAO();
           List<Quiz>lisa=qd.findByAuthor(AuthorID);
           int count=0;
           for(Quiz qa:lisa)
           {
               count++;
           }
           return(count);
       }
       public Author findByID(String AuthorID)
       {
        DBObject query=new BasicDBObject();
        query.put("AuthorID",AuthorID);
        DBObject data=this.col.findOne(query);
        return AuthorConverter.toAuthor(data);  
       }
}


