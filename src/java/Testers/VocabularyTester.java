/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testers;
import DAO.*;
import Model.*;
import java.net.UnknownHostException;
import java.util.List;
public class VocabularyTester 
{
 public static void main (String args[])throws UnknownHostException 
 {
VocabularyDAO vocDAO=new VocabularyDAO();
Vocabulary v=new Vocabulary();
v.setWordId("W0004");
v.setUserId("U0001");
vocDAO.createVocabulary(v);
    List<Vocabulary> lists=vocDAO.readVocabulary("U0001");
       
     for(Vocabulary us:lists)
   {
       System.out.println(us.getWordId()+","+us.getId()+","+us.getUserId());
   }  
 
 }    
}
