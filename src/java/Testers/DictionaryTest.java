/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testers;
import DAO.*;
import Model.*;
import com.mongodb.MongoClient;
import java.net.UnknownHostException;
import java.util.List;

/**
 *
 * @author Sakshi Sinha
 */
public class DictionaryTest 
{
public static void main(String[] args) throws UnknownHostException 
 {
   Dictionary d=new Dictionary();
   d.setWordId("NASCENT11234");
   d.setWord("Damn");
   d.setMeaning("Does Not Work");
   //MongoClient mongo = new MongoClient("localhost", 27017);
   DictionaryDAO dictDAO = new DictionaryDAO();
   //Create
   dictDAO.createDictionary(d);
   System.out.println("Word Added Successfully with id="+d.getWordId()+","+d.getWord()+","+d.getMeaning());
   List<Dictionary> list=dictDAO.readAllWords();
   for(Dictionary us:list)
   {
       System.out.println(us.getWordId()+","+us.getWord()+","+us.getMeaning());
   }
   List<Dictionary> lists=dictDAO.readWords("NASCENT1123");
     for(Dictionary us:lists)
   {
       System.out.println(us.getWordId()+","+us.getWord()+","+us.getMeaning());
   }
          
 }    
}
