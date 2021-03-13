package binaryTree;

public class Node {
	
	int value;
	Node left;
	Node right;
	
	public Node(int num, Node nextL, Node nextR) {
		value = num;
		left = nextL;
		right = nextR;
	}
}
