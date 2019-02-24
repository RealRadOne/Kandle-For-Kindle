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
public class user {
    private String Name;
    private String UserID;
    private String Password;
    private float KindlePoints;
    private int Level;
    
    public user(){
        
    }
    public String getName(){
        return Name;
    }
    public void setName(String Name){
        this.Name=Name;
    }
    public String UserID(){
        return UserID;
    }
    public void UserID(String UserID){
        this.UserID=UserID;
    }
   public String getPassword(){
        return Password;
    }
    public void setPassword(String Password){
        this.Password=Password;
    }
   public float getKindlePoints(){
        return KindlePoints;
    }
    public void setKindlePoints(float KindlePoints){
        this.KindlePoints=0;
    }
   public int getLevel(){
        return Level;
    }
    public void setLevel(int Level){
        this.Level=Level;
    }
   
}
