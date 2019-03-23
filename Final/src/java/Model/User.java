package Model;
/**
 *
 * @author Sakshi Sinha
 */
public class User 
{
        private String UserID;
	private String Level;
	private String KindlePoints;
        
	
	public String getUserId() {
		return UserID;
	}
	public void setUserId(String UserID) {
		this.UserID = UserID;
	}
	public String getLevel() {
		return Level;
	}
	public void setLevel(String Level) 
        {
		this.Level = Level;
	}
	public String getKindlePoints() {
		return KindlePoints;
	}
	public void setKindlePoints(String KindlePoints) {
		this.KindlePoints = KindlePoints;
	}       
}
