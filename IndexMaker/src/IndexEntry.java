import java.util.ArrayList;
import java.util.Collections;

/**
 * @author gibbonss
 *
 */
public class IndexEntry {

	private String word;
	/**
	 * 
	 */
	private ArrayList<Integer> numsList;

	/**
	 * @return
	 */
	public String getWord() {
		return word;
	}

	/**
	 * @param word
	 */
	public IndexEntry(String word) {
		this.word = word.toUpperCase();
		numsList = new ArrayList<Integer>();
	}

	/**
	 * @param num
	 */
	public void add(int num) {
		if (!numsList.contains(new Integer(num))) {
			numsList.add(num);
		}
		Collections.sort(numsList);
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return this.getWord() + " " + numsList;
	}

}
