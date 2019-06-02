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
       a.setName("J.R. Ward");
       a.setEmail("abced@gmail.com");
       a.setPassword("123456abc");
       a.setAuthorID("ASPX1123");
       AuthorDAO adao=new AuthorDAO();
       Author aa=adao.findAuthor("J.R. Ward");
       System.out.println(aa.getAuthorID());
    }
}
