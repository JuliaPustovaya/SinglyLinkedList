public class NodeImpl {
	private int sizeListNodes = 0;
	private Node listNodes = new Node();

	public void addBack(int value) {
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

	public void addFront(int value) {
		Node newNode = new Node();
		newNode.setValue(value);
		newNode.setNext(listNodes);
		listNodes=newNode;



		

		

	}

	public void removeByValue(int value) {
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
