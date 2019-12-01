package aa224iu__assign3;

public class Word implements Comparable<Word> {
	private String word;
	
	public static void  main (String []args) {
		Word w = new Word("hello");
		Word r = new Word("HELLO");
		System.out.println(w.hashCode());
		System.out.println(r.hashCode());
		System.out.println(r.equals(w));
		System.out.println(r.compareTo(w));
		System.out.println(-10%20);
	}

	public Word(String str) {
		word = str;
	}

	public String toString() {
		return word;
	}
	
	@Override	
	public int hashCode() {	
//		int hash = word.toLowerCase().hashCode();
		int hash = 0xDECAFBAD;		
		for (int i = 0; i < word.length(); i++) {
			hash = hash ^ word.toLowerCase().charAt(i);
		}
		return hash;
		
	}

	public boolean equals(Object other) {
		if (word.toLowerCase().equals(other.toString().toLowerCase()))
		return true;
		else 
			return false;
	}

	/* Implement Comparable */
	public int compareTo(Word w) {
		return word.toLowerCase().compareTo(w.word.toLowerCase());
		
	}
}
