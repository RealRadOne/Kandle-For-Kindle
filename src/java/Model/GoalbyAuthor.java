/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import java.util.Date;
import java.text.*;
import java.time.*;
import java.util.Calendar;
/**
 *
 * @author Akanksha
 */
public class GoalbyAuthor extends Goal {
private String AuthorId;
private int Num;

    public String getAuthorId() {
        return AuthorId;
    }

    public void setAuthorId(String AuthorId) {
        this.AuthorId = AuthorId;
    }

    public int getNum() {
        return Num;
    }

    public void setNum(int num) {
        this.Num = num;
    }
}
