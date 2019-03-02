/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utility;
/**
 *
 * @author Aastha Sahay
 */
import classes.dictionary;
import dbutils.connection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Dbutils 
{
    public static List<dictionary> getWords (Connection conn,String UserID)throws SQLException
    {
        String sql = "Select a.Word, a.WordID, a.Meaning from dictionary a,  vocabulary b" + " where b.UserID = ? and a.WordID = b.WordID";
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setString(1, UserID);
        ResultSet rs = pstm.executeQuery();
        List<dictionary> list = new ArrayList<dictionary>();
        while (rs.next()) 
        {
            String WordID = rs.getString("WordID");
            String Word = rs.getString("Word");
            String Meaning = rs.getString("Meaning");
            dictionary d1 = new dictionary();
            d1.setWordID(WordID);
            d1.setWord(Word);
            d1.setMeaning(Meaning);
            list.add(d1);
        }
        return list;
    }
}