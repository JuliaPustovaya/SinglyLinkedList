public class NodeImpl<V> {
	private int sizeListNodes = 0;
	private Node<V> listNodes = new Node();

	public void addBack(V value) {
		if (listNodes.getValue() == null) {
			listNodes.setValue(value);
			listNodes.setNext(null);
		} else {
			Node nodeNext = listNodes;
			while (nodeNext.getNext() != null) {
				nodeNext = nodeNext.getNext();
			}
			Node<V> node = new Node();
			node.setValue(value);
			nodeNext.setNext(node);
		}
	}

	public void addFront(V value) {
		Node<V> newNode = new Node();
		newNode.setValue(value);
		newNode.setNext(listNodes);
		listNodes = newNode;
	}

	public void removeByValue(V value) {
		if (size() > 0) {
			Node currentNode = listNodes;
			while (currentNode.getNext().getValue() != value) {
				currentNode = currentNode.getNext();
			}
			Node nodePrev = currentNode.getNext().getNext();
			currentNode.setNext(nodePrev);
		}
	}

	public int size() {
		sizeListNodes = 0;
		Node node;
		node = listNodes;
		while (node != null) {
			sizeListNodes++;
			node = node.getNext();
		}
		return sizeListNodes;
	}

	public void representOnScreen() {
		Node currNode= listNodes;
		for (int i = 0; i <size() ; currNode=currNode.getNext()) {
			System.out.print(currNode.getValue()+ " ");
			i++;

		}
	}
}
