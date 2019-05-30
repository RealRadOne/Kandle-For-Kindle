/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utility;
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
                 BookDAO vocDAO = new BookDAO();
                 List<Book> lists=vocDAO.GetBooks(str);
                 return lists;
       }
    public static Book Getthisbook(String str)
    {
                 BookDAO vocDAO = new BookDAO();
                 Book b=vocDAO.GetthisBook(str);
                 return b;
        
    }
    public static Book GetbookbyId(String id){
        BookDAO vocDAO = new BookDAO();
        Book b=new Book();
        b.setBookId(id);
                  b=vocDAO.readBook(b);
                 return b;
    }
 

}