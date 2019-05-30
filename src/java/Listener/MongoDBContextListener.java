package Listener;
import java.net.UnknownHostException;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import com.mongodb.MongoClient;
/**
 *
 * @author Sakshi Sinha
 */
@WebListener
public class MongoDBContextListener implements ServletContextListener
{
    @Override
    public void contextInitialized(ServletContextEvent sce) 
    {
        ServletContext ctx=sce.getServletContext();
        MongoClient conn = new MongoClient(ctx.getInitParameter("MONGODB_HOST"),Integer.parseInt(ctx.getInitParameter("MONGODB_PORT")));
        System.out.println("MongoClient initialized successfully");
        sce.getServletContext().setAttribute("MONGO_CLIENT", conn);
        //throw new UnknownHostException("MongoClient Init Failed");
    }
    @Override
     public void contextDestroyed(ServletContextEvent sce) 
     {
        MongoClient conn =(MongoClient) sce.getServletContext().getAttribute("MONGO_CLIENT");
        conn.close();
        System.out.println("MongoClient closed successfully");
    }
     

}
