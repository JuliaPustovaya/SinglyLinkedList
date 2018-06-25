public class Node<V> {
	private  V value;
	private  Node next;


	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}


	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
}

