/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import Connect.Connection;
import Model.Goal;
import Converter.*;
import com.mongodb.BasicDBObjectBuilder;
import org.bson.types.ObjectId;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.BasicDBObject;
import com.mongodb.DBCursor;
/**
 *
 * @author Sakshi Sinha
 */
public interface GoalDAO 
{
  
        public Goal createGoal(Goal g);
        public void updateGoal(Goal g);
        public List<Goal> readUserwise(String UserID);
        
}
