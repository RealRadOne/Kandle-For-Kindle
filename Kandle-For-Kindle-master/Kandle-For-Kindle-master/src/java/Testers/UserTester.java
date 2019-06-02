package Testers;
import java.net.UnknownHostException;
import Model.User;
import DAO.UserDAO;
import java.util.*;

/**
 *
 * @author Sakshi Sinha
 */
public class UserTester 
{
 public static void main(String[] args) throws UnknownHostException 
 {
     User u=new User();
     u.setUserId("UTX002");
     u.setUserName("Nalayak2.0");
     UserDAO usk=new UserDAO();
     usk.createUser(u);
     System.out.println(u.getUserName()+","+u.getUserId());
     u.setKindlePoints(400.99);
     u.setLevel("Hellguy");
     usk.updateUser(u);
     System.out.println(u.getUserName()+","+u.getUserId());
 }
}
 
