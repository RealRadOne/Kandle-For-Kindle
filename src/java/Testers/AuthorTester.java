/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testers;
import DAO.AuthorDAO;
import Model.Author;
/**
 *
 * @author Akanksha
 */
public class AuthorTester {
    public static void main(String [] args){
       Author a=new Author();
       a.setName("RadOne");
       a.setEmail("abced@gmail.com");
       a.setPassword("123456abc");
       a.setAuthorID("U0001");
       System.out.println("Author with Name"+a.getName());
       AuthorDAO adao=new AuthorDAO();
       adao.createAuthor(a);
       Author am=adao.findAuthor("RadOne");
       int nums=adao.totKonnects("U0001");
       System.out.println(am.getAuthorID()+"**"+nums);
      
    }
}
