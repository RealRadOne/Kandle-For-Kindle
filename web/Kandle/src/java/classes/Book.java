/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author Sakshi Sinha
 */
public class Book {
    private String BookID;
    private String BookName;
    private float Points;
    
    public Book(){
        
    }
    public Book(String BookID,String BookName,float Points){
        this.BookID=BookID;
        this.BookName=BookName;
        this.Points=Points;
    }
    
    public String getBookID(){
        return BookID;
    }
    
    public void setBookID(String BookID){
        this.BookID=BookID;
    }
    
    public String getBookName(){
        return BookName;
    }
    
    public void setBookName(String BookName){
        this.BookName=BookName;
    }
    
    public float getPoints(){
        return Points;
    }
    
    public void setPoints(float Points){
        this.Points=Points;
    }
}
