/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import java.util.Date;


/**
 *
 * @author Akanksha Sinha
 */
public class Goal 
{

    
    private Date Date;
    private String GoalID;
    private String UserID;
    private String Type;
    private String Status;
    
    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    /*public Goal(Date Date, String GoalID, String UserID) {
        this.Date = Date;
        this.GoalID = GoalID;
        this.UserID = UserID;
    }*/
    
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

}
