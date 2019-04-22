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
 * @author Sakshi Sinha
 */
public class Quiz 
{
private Date Date;
private LocalDateTime Time;
private String QuizID;
private String QuizName;
private String AuthorID;
private String BookID;
public Date getDate()
{
            return Date;
}
public void setDate(Date Date)
{
            this.Date=Date;
}
public LocalDateTime getTime()
{
            return Time;
}
public void setTime(LocalDateTime Time)
{
            this.Time=Time;
}
public String getQuizID()
{
            return QuizID;
}
public void setQuizID(String QuizID)
{
            this.QuizID=QuizID;
}
public String getQuizName()
{
            return QuizName;
}
public void setQuizName(String QuizName)
{
            this.QuizName=QuizName;
}
public String getAuthorID()
{
            return AuthorID;
}
public void setAuthorID(String AuthorID)
{
            this.AuthorID=AuthorID;
}
public String getBookID()
{
            return BookID;
}
public void setBookID(String BookID)
{
            this.BookID=BookID;
}

}
