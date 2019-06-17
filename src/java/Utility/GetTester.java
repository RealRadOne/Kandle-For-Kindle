/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utility;
import Model.*;
import DAO.*;
import Converter.*;
import java.util.List;
/**
 *
 * @author Sakshi Sinha
 */
public class GetTester 
{
 public static void main(String args[])
 {
 UserDAO ud=new UserDAO();
 VocabularyDAO vd=new VocabularyDAO();
 List<Vocabulary>lisa=vd.readVocabulary("U0001");
 for(Vocabulary vs:lisa)
 {
     String WordID=vs.getWordId();
     System.out.println(WordID);
 }
 }
}
