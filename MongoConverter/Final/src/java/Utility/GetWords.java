/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utility;
import Converter.DictionaryConverter;
import DAO.*;
import Model.*;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Sakshi Sinha
 */
public class GetWords 
{
    public static List<Dictionary> getWords (Vocabulary v)
    {
    List<Dictionary> data = new ArrayList<Dictionary>();
     MongoClient mongo = new MongoClient("localhost", 27017);
     VocabularyDAO vocDAO = new VocabularyDAO(mongo);
     List<Vocabulary> lists=vocDAO.readVocabulary(v);
     for(Vocabulary us:lists)
   {
       Dictionary d=new Dictionary();
       d.setWordId(us.getWordId());
       DictionaryDAO dictDAO = new DictionaryDAO(mongo);
       List<Dictionary> listed=dictDAO.readWords(d);
       for(Dictionary obj:listed)
       {
       data.add(obj);
       }
   }
     return(data);
   }
}
