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
 Vocabulary v=new Vocabulary();
 v.setUserId("ASFXIO");
 List<Dictionary> lists=GetWords.getWords(v.getUserId());
     for(Dictionary us:lists)
   {
       System.out.println(us.getWordId()+","+us.getWord()+","+us.getMeaning());
   }
 }
}
