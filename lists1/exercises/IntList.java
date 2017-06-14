public class IntList {
	public int first;
	public IntList rest;

	public IntList(int f, IntList r) {
		first = f;
		rest = r;
	}

	/** Return the size of the list using... recursion! */
	public int size() {
		if (rest == null) {
			return 1;
		}
		return 1 + this.rest.size();
	}

	/** Return the size of the list using no recursion! */
	public int iterativeSize() {
		IntList p = this;
		int totalSize = 0;
		while (p != null) {
			totalSize += 1;
			p = p.rest;
		}
		return totalSize;
	}

	/** Returns the ith value in this list.*/
	public int get(int i) {
		if (i == 0) {
			return this.first;
		} else {
			return this.rest.get(i - 1);
		}
	}
	/** add first method*/
	public void addFirst(int x) {
		IntList L = new IntList(this.first, this.rest);
		this.first = x;
		this.rest = L;
	}
	public static void main(String[] args) {
		IntList L = new IntList(15, null);
		L.addFirst(10);
		L.addFirst(5);

		System.out.println(L.iterativeSize());
		System.out.println(L.first);
	}
} 