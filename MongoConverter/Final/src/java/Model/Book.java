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
public class Book 
{
private String BookID;
private Double KindlePoints;
private String Name;
         
        public String getBookId() {
		return BookID;
	}
	public void setBookId(String BookID) {
		this.BookID =BookID;
	}
	public String getName() {
		return Name;
	}
	public void setName(String Name) 
        {
		this.Name = Name;
	}
	public double getKindlePoints() {
		return KindlePoints;
	}
	public void setKindlePoints(double KindlePoints) {
		this.KindlePoints = KindlePoints;
	}   
}

