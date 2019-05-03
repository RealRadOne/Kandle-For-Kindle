/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testers;
import java.util.List;
import DAO.*;
import Model.*;
import com.mongodb.MongoClient;
import java.net.UnknownHostException;
import java.util.Date;
/**
 *
 * @author Akanksha
 */
public class AuthorTester {
    public static void main(String [] args){
       Author a=new Author();
       a.setAuthorID("1233");
       a.setName("J.R. Ward");
       a.setEmail("abced@gmail.com");
       a.setPassword("123456abc");
       AuthorDAO adao=new AuthorDAO();
       adao.createAuthor(a);
       Author a1=new Author();
       a1.setAuthorID("123tt23");
       a1.setName("Michael Ondaatje");
       a1.setEmail("aabce123d@gmail.com");
       a1.setPassword("12tt3as456abc");
       adao.createAuthor(a1);
       System.out.println("Successfully created author:"+a.getId());
               
    }
}
