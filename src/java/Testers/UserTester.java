package Testers;
import java.net.UnknownHostException;
import Model.*;
import DAO.*;
import java.util.List;

/**
 *
 * @author Sakshi Sinha
 */
public class UserTester 
{
 public static void main(String[] args) throws UnknownHostException 
 {
     UserDAO uk=new UserDAO();
     List<Dictionary>miska=uk.GetWords("U0001");
     for(Dictionary dk:miska)
     {
         System.out.println(dk.getWord());
     }
     
 }
}
 
