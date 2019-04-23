package Model;
/**
 *
 * @author Sakshi Sinha
 */
public class User 
{
        private String userName;
        private String UserID;
	private String Level;
	private Double KindlePoints;
        private String password;
	private String Email;
        public String getuserName()
        {
            return userName;
        }
        public void setuserName(String userName)
        {
            this.userName=userName;
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
            return password;
        }
        public void setPassword(String password)
        {
            this.password=password;
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
