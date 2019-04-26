/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton;

/**
 *
 * @author Akanksha
 */
import com.mongodb.MongoClient;
import javax.ejb.Singleton;
import javax.ejb.Startup;
@Singleton
public class Connection {
    private static final MongoClient mongo=new MongoClient("localhost", 27017);
    public static MongoClient getClient(){
        return mongo;
    }
    
}
