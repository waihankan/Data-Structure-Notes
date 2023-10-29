public class SLList {
	private static class IntNode {
		public int item;
		public IntNode next;

		public IntNode (int num, IntNode n) {
			item = num;
			next = n;
		}
	}

	private IntNode sentinel;
	private int size;

	public SLList () {
		sentinel = new IntNode(63, null);
		size = 0;
	}
	public SLList (int num) {
		// Constructor
		// SLList(10) should give 10 -> null, therefore, next is null in this case
		sentinel = new IntNode(63, null);
		sentinel.next = new IntNode(num, null);
		size = 1;
	}

	public void addFirst(int num) {
		// 0 ->  whatever
		// 0 -> num -> whatever
		sentinel.next = new IntNode(num, sentinel.next);
		size = size + 1;
	}

	public int getFirst() {
		return sentinel.next.item;
	}

	public int size() {
		return this.size;
	}

	public void addLast(int num) {
		IntNode ptr = sentinel;
		while (ptr.next != null) {
			ptr = ptr.next;
		}
		ptr.next = new IntNode(num, null);
	}

	public void printList() {
		IntNode ptr = sentinel.next;
		while (ptr != null) {
			System.out.println(ptr.item);
			ptr = ptr.next;
		}
	}
	public static void main(String args[]) {
		SLList s_list =  new SLList(9);
		s_list.addFirst(10); // 10 -> 9
		s_list.addLast(-1000);

		s_list.printList();
	}


	// basically sentinel node solves the edge cases. there's no null as a first node.
	// this ensures that the first node always exists.
}

