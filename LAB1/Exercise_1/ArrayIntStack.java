package aa224iu__assign1.Exercise_1;

public class ArrayIntStack extends AbstractIntCollection implements IntStack {

	@Override
	public void push(int n) {
		if (size % 7 == 0) {
			resize();
		}

		for (int i = size + 1; i > 0; i--) {
			values[i] = values[i - 1];

		}

		values[0] = n;
		size++;

	}

	@Override
	public int pop() throws IndexOutOfBoundsException {
		if (size == 0) {
			throw new IndexOutOfBoundsException("Error, OUT OF RANGE");
		}

		int popUp = values[0];

		for (int i = 0; i < size - 1; i++) {
			values[i] = values[i + 1];
		}

		size--;
		return popUp;
	}

	@Override
	public int peek() throws IndexOutOfBoundsException {
		if (size == 0) {
			throw new IndexOutOfBoundsException("Error, OUT OF RANGE");
		}

		return values[0];
	}

}
