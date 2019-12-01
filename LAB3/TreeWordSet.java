package aa224iu__assign3;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class TreeWordSet implements WordSet {
	private int size;
	private BST root = null;

	@Override
	public Iterator<Word> iterator() {
		
		return new TreeWordIterator(root);
	}



	@Override
	public void add(Word word) {
		if (root == null) {
			root = new BST(word);
			size++;
		}
		else
			root.add(word);
		
	}

	@Override
	public boolean contains(Word word) {

		return root.contains(word);
	}

	@Override
	public int size() {

		return size;
	}

	private class BST {
		Word word;
		BST left = null, right = null,parent = null;

		BST(Word n) {
			word = n;
		}

			


		// Comparator
		Comparator<String> comp = (String o1, String o2) -> (o1.compareTo(o2));
		
		// add
		void add(Word n) {
			
			if (0 < comp.compare(word.toString().toLowerCase(), n.toString().toLowerCase())) {
				if (left == null) {
					left = new BST(n);
					left.parent = this;
					size++;
				}
				else
					left.add(n);
			} else if (0 > comp.compare(word.toString().toLowerCase(), n.toString().toLowerCase())) {
				if (right == null) {
					right = new BST(n);
					right.parent = this;
					size++;
				}
				else
					right.add(n);
				
			}
		}

		// true if tree contain String n
		boolean contains(Word n) {
			if (0 < comp.compare(word.toString().toLowerCase(), n.toString().toLowerCase())) {
				if (left == null)
					return false;
				else
					return left.contains(n);
			} else if (0 > comp.compare(word.toString().toLowerCase(), n.toString().toLowerCase())) {
				if (right == null)
					return false;
				else
					return right.contains(n);
			}

			return true; // Found!!!!!!!
		}

	}
	
	private class TreeWordIterator implements Iterator<Word>{
		private BST ongoing;	
		
		public TreeWordIterator (BST root) throws NoSuchElementException{
			if (root == null) {
				throw new NoSuchElementException();
			}
			
			ongoing = root;
			
			//start at the leeeeft side
			while(ongoing.left != null) {
				ongoing = ongoing.left;
			}
			
		}
		@Override
		public boolean hasNext() {
			
			return ongoing != null;
		}

		@Override
		public Word next() throws NoSuchElementException{
			if (ongoing == null) {
				throw new NoSuchElementException();
				
			}
			
			BST next = ongoing;
			
			//GO RIGHT IF IT POSSIBLE
			if(ongoing.right != null) {
				ongoing = ongoing.right;
				while (ongoing.left != null) {
					ongoing = ongoing.left;
				}
				
				return next.word;
			}
			
			//TO THE MOON pew pew(i mean tree)
			while (true) {
				if(ongoing.parent == null) {
					ongoing = null;
					return next.word;
				}
				if (ongoing.parent.left == ongoing) {
					ongoing = ongoing.parent;
					return next.word;
				}
				
				else 
					ongoing = ongoing.parent;
				
			}
			
		}
		
	}
	

}
