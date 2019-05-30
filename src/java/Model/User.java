package Model;
/**
 *
 * @author Sakshi Sinha
 */
public class User 
{
        private String UserName;
        private String UserID;
	private String Level;
	private Double KindlePoints;
        private String Password;
	private String Email;
        public String getUserName()
        {
            return UserName;
        }
        public void setUserName(String UserName)
        {
            this.UserName=UserName;
        }
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
	public Double getKindlePoints() {
		return KindlePoints;
	}
	public void setKindlePoints(Double KindlePoints) {
		this.KindlePoints = KindlePoints;
	}  
        public String getPassword()
        {
            return Password;
        }
        public void setPassword(String Password)
        {
            this.Password=Password;
        }
         public String getEmail()
        {
            return Email;
        }
        public void setEmail(String Email)
        {
            this.Email=Email;
        }
}
