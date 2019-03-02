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
    private String wordID;
    private String word;
    private String meaning;
    
    public dictionary(){
        
    }
    public dictionary(String WordID,String Word,String Meaning){
        this.wordID=WordID;
        this.word=Word;
        this.meaning=Meaning;
    }
    public String getWordID(){
        return wordID;
    }
    public void setWordID(String WordID){
        this.wordID=WordID;
    }
    public String getWord(){
        return word;
    }
    public void setWord(String Word){
        this.word=Word;
    }
     public String getMeaning(){
        return meaning;
    }
    public void setMeaning(String Meaning){
        this.meaning=Meaning;
    }
    
}
