package Connect;
import com.mongodb.MongoClient;

public class Connection 
{
    public final MongoClient mongo;
    private static Connection connect;
    private Connection()
    {
     mongo=new MongoClient("localhost", 27017);
    }
    public static synchronized Connection getConnection()
    {
    if(connect==null)
    {
    	connect=new Connection();
    }
    return connect;
    } 
   
}
