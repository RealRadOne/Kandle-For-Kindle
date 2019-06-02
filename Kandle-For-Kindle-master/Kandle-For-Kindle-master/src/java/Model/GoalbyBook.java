/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Akanksha
 */
public class GoalbyBook extends Goal {
    private String BookID;

    /*public GoalbyBook(java.util.Date Date, String GoalID, String UserID,String BookID) {
        super(Date, GoalID, UserID);
        this.BookID=BookID;
    }

    public GoalbyBook() {
        super();
    }*/
    

    public String getBookID() {
        return BookID;
    }

    public void setBookID(String BookID) {
        this.BookID = BookID;
    }

    

    

    

    
    
}
