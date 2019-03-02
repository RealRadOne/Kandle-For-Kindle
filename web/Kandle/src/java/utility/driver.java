/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utility;
import dbutils.*;
import java.util.ArrayList;
import java.util.List;
import classes.dictionary;
import java.sql.Connection;
import java.sql.SQLException;
/**
 *
 * @author Aastha Sahay
 */
public class driver {
    public static void main(String args[]) throws ClassNotFoundException, SQLException
    {
        Dbutils u1=new Dbutils();
        List<dictionary> l1 = new ArrayList<dictionary>();
        Connection conn = connection.getMySQLConnection();
        System.out.println("Connection established");
        l1=u1.getWords(conn,"U0002");
        System.out.println("");
        for(dictionary model : l1) 
        {
            System.out.println(model.getWordID()+ " " + model.getWord() + " " + model.getMeaning());
        }
    }
}
