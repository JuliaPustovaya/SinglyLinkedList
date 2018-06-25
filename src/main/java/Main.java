public class Main {
	public static void main(String[] args) {
		NodeImpl node=  new NodeImpl();
		node.put(10);
		node.put(12);
		node.put(13);
		node.put(14);
		node.put(16);
		System.out.println(node.size());

	}
}
