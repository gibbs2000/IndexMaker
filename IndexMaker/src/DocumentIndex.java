import java.util.ArrayList;

/**
 * 
 */

/**
 * @author gibbonss
 *
 */
public class DocumentIndex extends ArrayList<IndexEntry> {

	public DocumentIndex() {
		super();
	
	}
	
	/**
	 * @param size
	 */
	public DocumentIndex(int size) {
		super(size);
		
	}
	
	/**
	 * @param word
	 * @return
	 */
	private int foundOrInserted(String word) {
		int i = 0;
		while(word.compareTo(this.get(i).getWord())>=0)
		i++;
		return i;
	}
	
	/**
	 * @param word
	 * @param num
	 */
	public void addWord(String word, int num) {
		foundOrInserted(word);
		
	}
	
	
}
