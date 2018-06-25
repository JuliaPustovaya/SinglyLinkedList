public class Main {
	public static void main(String[] args) {

		NodeImpl node=  new NodeImpl();
		node.addBack(10);
		node.addBack(12);
		node.addBack(13);
		node.addBack(14);
		node.addBack(16);
		System.out.println("Size of listNode "+node.size());
		node.representOnScreen();
		node.removeByValue(13);
		System.out.println(" \n Size of listNode after remove "+node.size());
		node.representOnScreen();
		System.out.println(" \n Add element in front");
		node.addFront(25);
		node.representOnScreen();

	}
}
