package Testers;
import java.net.UnknownHostException;
import Converter.*;
import Model.*;
import DAO.*;
import Listener.*;
import com.mongodb.BasicDBObjectBuilder;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.WriteResult;
import java.util.*;

/**
 *
 * @author Sakshi Sinha
 */
public class UserTester 
{
 public static void main(String[] args) throws UnknownHostException 
 {
   User u = new User();
   u.setLevel("Beginner");
   u.setKindlePoints("200");
   //u.setUserId("USER4390");
   MongoClient mongo = new MongoClient("localhost", 27017);
   UserDAO userDAO = new UserDAO(mongo);
   //Create
   userDAO.createUser(u);
   System.out.println("User Added Successfully with id="+u.getUserId());
   List<User> list=userDAO.readAllUser();
   /*
   for(User us:list)
   {
       System.out.println(us.getKindlePoints()+","+us.getLevel()+","+us.getUserId());
   }
           */
   User datas=userDAO.readUser(u);
    System.out.println("User Data="+datas.getUserId()+","+datas.getLevel()+","+datas.getKindlePoints());
 }
}
 
