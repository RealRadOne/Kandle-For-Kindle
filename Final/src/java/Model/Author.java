/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Sakshi Sinha
 */
public class Author 
{
private String ID;
private String AuthorID;
private String Name;
        public String getId(){
            return ID;
        }
        public void setId(String ID){
            this.ID=ID;
        }
        public String getAuthorID(){
            return AuthorID;
        }
        public void setAuthorID(String AuthorID){
            this.AuthorID=AuthorID;
        }
        public String getName() {
		return Name;
	}
	public void setName(String Name) {
		this.Name =Name;
	}
}
