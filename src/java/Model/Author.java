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
private String AuthorID;
private String Name;
private String Password;
private String Email;
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
        public String getEmail() {
		return Email;
	}
	public void setEmail(String Email) {
		this.Email =Email;
	}
        public String getPassword() {
		return Password;
	}
	public void setPassword(String Password) {
		this.Password =Password;
	}
}
