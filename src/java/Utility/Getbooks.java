/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utility;
import Singleton.*;
import Converter.BookConverter;
import Converter.DictionaryConverter;
import DAO.*;
import Model.*;
import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
/**
 *
 * @author Sakshi Sinha
 */
public class Getbooks
{
    
    public static List<Book> GetBooks(String str) 
       {
           
                // List<Dictionary> data = new ArrayList<Dictionary>();
                 MongoClient mongo = Connection.getClient();
                 BookDAO vocDAO = new BookDAO(mongo);
                 List<Book> lists=vocDAO.GetBooks(str);
                 return lists;
       }
    public static Book Getthisbook(String str)
    {
        MongoClient mongo = Connection.getClient();
                 BookDAO vocDAO = new BookDAO(mongo);
                 Book b=vocDAO.GetthisBook(str);
                 return b;
        
    }
 

}