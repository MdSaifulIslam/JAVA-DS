package BST;


class Node{
	int data;
	Node left, right;
	Node(int data){
		this.data = data;
		this.left = this.right = null;
	}
}

public class FindMinimumInBST{
	
	Node insertNewValue(Node node, int data) {
		
		if(node == null) {
			return new Node(data);
		}
		
		if(data <= node.data) {
			node.left = insertNewValue(node.left, data);
		}else {
			node.right = insertNewValue(node.right, data);
		}
		
		return node;
	}
	
	void printTree(Node node) {
		
		if(node == null) {
			return;
		}
		
		printTree(node.left);
		System.out.println(node.data);
		printTree(node.right);
	}
	
	int findMinimumValue(Node node) {
		
		if(node == null) {
			return Integer.MIN_VALUE;
		}
		
		if(node.left == null) {
			return node.data;
		}
		
		findMinimumValue(node.left);
		
		return Integer.MIN_VALUE;
	}
	
	public static void main(String[] args) {
		FindMinimumInBST tree = new FindMinimumInBST();
		
		Node root = null;
		System.out.println(tree.findMinimumValue(root));
		root = tree.insertNewValue(root, 1);
		
		root = tree.insertNewValue(root, 15);
		root = tree.insertNewValue(root, 2);
		root = tree.insertNewValue(root, 5);
		root = tree.insertNewValue(root, 25);
		
		tree.printTree(root);
		
		System.out.println(tree.findMinimumValue(root));
	}
}