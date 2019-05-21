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
public class GoalbyAuthor extends Goal 
{
private String AuthorID;
private int Num;

    public String getAuthorId() {
        return AuthorID;
    }

    public void setAuthorId(String AuthorID) {
        this.AuthorID = AuthorID;
    }

    public int getNum() {
        return Num;
    }

    public void setNum(int num) {
        this.Num = num;
    }
}
