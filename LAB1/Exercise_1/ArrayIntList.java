package aa224iu__assign1.Exercise_1;

public class ArrayIntList extends AbstractIntCollection implements IntList {

	@Override
	public void add(int n) {
		values[size] = n;
		size++;
	}

	@Override
	public void addAt(int n, int index) throws IndexOutOfBoundsException {
		if (size % 7 == 0) {
			resize();
		}

		if (index > size) {
			throw new IndexOutOfBoundsException("Error, Position out of range");
		}

		for (int i = size + 1; i > index ; i--) {
			values[i] = values[i - 1];

		}

		size++;
		values[index ] = n;

	}

	@Override
	public void remove(int index) throws IndexOutOfBoundsException {
		if (index > size) {
			throw new IndexOutOfBoundsException("Error, Position out of range");
		}

		for (int i = index ; i < size; i++) {
			values[i] = values[i + 1];
		}

		size--;

	}

	@Override
	public int get(int index) throws IndexOutOfBoundsException {
		if (index  < size)
			return values[index];

		else
			throw new IndexOutOfBoundsException("Error, Position out of range");
	}

	@Override
	public int indexOf(int n) {
		for (int i = 0; i < size; i++) {
			if (n == values[i])
				return i;
		}

		return -1;
	}

}
