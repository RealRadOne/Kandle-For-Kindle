/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import java.util.Date;

/**
 *
 * @author Sakshi Sinha
 */
public class Goal 
{
    private Date Date;
    private String GoalID;
    private String UserID;
    private String BookID;
    
public Date getDate()
{
            return Date;
}
public void setDate(Date Date)
{
            this.Date=Date;
}
public String getGoalId() 
{
		return GoalID;
}
public void setGoalId(String GoalID)
{
		this.GoalID = GoalID;
}
public String getUserId() 
{
		return UserID;
}
public void setUserId(String UserID) 
{
		this.UserID = UserID;
}
public String getBookId() 
{
		return BookID;
}
public void setBookId(String BookID)
{
		this.BookID = BookID;
}
}
