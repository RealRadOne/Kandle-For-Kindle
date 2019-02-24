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
public class dictionary {
    private String WordID;
    private String Word;
    private String Meaning;
    
    public dictionary(){
        
    }
    public dictionary(String WordID,String Word,String Meaning){
        this.WordID=WordID;
        this.Word=Word;
        this.Meaning=Meaning;
    }
    public String getWordID(){
        return WordID;
    }
    public void setWordID(String WordID){
        this.WordID=WordID;
    }
     public String getWord(){
        return Word;
    }
    public void setWord(String Word){
        this.Word=Word;
    }
     public String getMeaning(){
        return Meaning;
    }
    public void setMeaning(String Meaning){
        this.Meaning=Meaning;
    }
    
}
