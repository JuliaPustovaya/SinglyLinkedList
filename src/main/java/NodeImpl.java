public class NodeImpl {
	int sizeListNodes = 0;
	Node listNodes = new Node();

	public void put(int value) {
		if (listNodes.getValue() == null) {
			listNodes.setValue(value);
			listNodes.setNext(null);
		} else {
			Node nodeNext = listNodes;
			while (nodeNext.getNext() != null) {
				nodeNext = nodeNext.getNext();
			}
			Node node = new Node();
			node.setValue(value);
			nodeNext.setNext(node);
		}
	}

	public int size() {
		Node node;
		node = listNodes;
		while (node != null) {
			sizeListNodes++;
			node = node.getNext();
		}
		return sizeListNodes;
	}
}
