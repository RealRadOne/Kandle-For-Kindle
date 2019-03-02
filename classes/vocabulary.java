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
public class vocabulary {
    private String UserID;
    private String WordID;
    
    public vocabulary(){
        
    }
    public vocabulary(String UserID,String WordID){
        this.UserID=UserID;
        this.WordID=WordID;
    }
    public void setUserID(String UserID){
        this.UserID=UserID;
    }
    public String getUserID(){
        return UserID;
    }
    public void setWordID(String WordID){
        this.WordID=WordID;
    }
    public String getWordID(){
        return WordID;
    }
            
}
