package Model;

/**
 *
 * @author Sakshi Sinha
 */
public class Dictionary
{
        private String ID;
        private String WordID;
	private String Word;
	private String Meaning;
        public String getId() {
		return ID;
	}
	public void setId(String WordID) {
		this.ID = ID;
	}
	public String getWordId() {
		return WordID;
	}
	public void setWordId(String WordID) {
		this.WordID = WordID;
	}
	public String getWord() {
		return Word;
	}
	public void setWord(String Word) 
        {
		this.Word = Word;
	}
	public String getMeaning() 
        {
		return Meaning;
	}
	public void setMeaning(String Meaning) 
        {
		this.Meaning = Meaning;
	}       
}

