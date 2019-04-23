/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testers;
import Converter.*;
import DAO.*;
import Model.*;
import com.mongodb.MongoClient;
import java.net.UnknownHostException;
import java.util.List;
public class VocabularyTester 
{
 public static void main (String args[])throws UnknownHostException 
 {
 Vocabulary v=new Vocabulary();
 v.setUserId("ASFXIO");
 v.setWordId("NASCENT123");
 VocabularyDAO vocDAO = new VocabularyDAO();
   //Create
 vocDAO.createVocabulary(v);
 System.out.println("Word Added Successfully with id="+v.getId());
 /*
   List<Vocabulary> list=vocDAO.readAllVocabulary();
   for(Vocabulary us:list)
   {
       System.out.println(us.getWordId()+","+us.getId()+","+us.getUserId());
   }
         */
    List<Vocabulary> lists=vocDAO.readVocabulary(v.getUserId());
     for(Vocabulary us:lists)
   {
       System.out.println(us.getWordId()+","+us.getId()+","+us.getUserId());
   }
 }    
}
