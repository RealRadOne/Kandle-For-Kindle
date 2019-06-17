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
public class Quiz 
{
private String Date;
private int Hour;
private int Minute;
private int Second;
private String QuizID;
private String QuizName;
private String UserID;
private String AuthorID;
private String BookID;
private int Score;
//Score here is considered the score of the User

public String getDate()
{
            return Date;
}
public void setDate(String Date)
{
            this.Date=Date;
}
public int getHour()
{
            return Hour;
}
public void setHour(int Hour)
{
            this.Hour=Hour;
}
public int getMinute()
{
            return Minute;
}
public void setMinute(int Minute)
{
            this.Minute=Minute;
}
public int getSecond()
{
            return Second;
}
public void setSecond(int Second)
{
            this.Second=Second;
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
public void setUserID(String UserID)
{
    this.UserID=UserID;
}
public String getUserID()
{
    return(UserID);
}
public void setScore(int UScore)
{
    this.Score=UScore;
}
public int getScore()
{
return(Score);    
}
}