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
public class GoalbyGenre extends Goal {
    private String Genre;
    private int Num;

    public String getGenre() {
        return Genre;
    }

    public void setGenre(String Genre) {
        this.Genre = Genre;
    }

    public int getNum() {
        return Num;
    }

    public void setNum(int Num) {
        this.Num = Num;
    }
}
