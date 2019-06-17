/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utility;
import DAO.*;
import Model.*;
import java.util.List;
/**
 *
 * @author Akanksha
 */
public class Getauthors {
    public static List<Author> GetAuthors(String str) 
       {
                 AuthorDAO vocDAO = new AuthorDAO();
                 List<Author> lists=vocDAO.GetAuthors(str);
                 return lists;
       }
    public static Author Getthisauthor(String str){
        AuthorDAO vocDAO = new AuthorDAO();
        Author a=vocDAO.GetthisAuthor(str);
        return a;
    }
}
