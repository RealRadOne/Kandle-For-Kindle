package Testers;
import Converter.*;
import DAO.*;
import Model.*;
import com.mongodb.MongoClient;
import java.net.UnknownHostException;
import java.util.List;
/**
 *
 * @author Sakshi Sinha
 */
public class BookTester
{
    public static void main (String args[])throws UnknownHostException 
 {
Book b=new Book();
b.setName("Shriya");
b.setKindlePoints(200);
b.setAuthor("AUGUTHA");
 MongoClient mongo = new MongoClient("localhost", 27017);
 BookDAO bocDAO = new BookDAO(mongo);
   //Create
 bocDAO.createBook(b);
 System.out.println("Book Added Successfully with id="+b.getBookId()+","+b.getKindlePoints()+","+b.getName()+b.getAuthor());
 /*
   List<Book> list=bocDAO.readAllBooks();
   for(Book us:list)
   {
       System.out.println(us.getName()+","+us.getKindlePoints()+","+us.getName());
   }
   */     
   List<Book> lists=bocDAO.GetBooks("S");
   Book bbb=bocDAO.GetthisBook("Shriya");
   for(Book us:lists)
   {
      System.out.println(us.getName()+","+us.getKindlePoints());
      System.out.println(bbb.getName()+","+bbb.getKindlePoints());
   }
 }    
}
