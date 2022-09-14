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
		Node current = node;
		
		if(current == null) {
			return;
		}
		printTree(current.left);
		System.out.println(node.data);
		printTree(current.right);
	}
	
	public static void main(String[] args) {
		FindMinimumInBST tree = new FindMinimumInBST();
		
		Node root = null;
		root = tree.insertNewValue(root, 1);
		
		tree.insertNewValue(root, 15);
		tree.insertNewValue(root, 2);
		tree.insertNewValue(root, 5);
		tree.insertNewValue(root, 25);
		
		tree.printTree(root);
	}
}

//class Node {
//
//	int data;
//	Node left, right;
//
//	Node(int d) {
//		data = d;
//		left = right = null;
//	}
//}
//
//class FindMinimumInBST {
//
//	static Node head;
//	
//	Node insert(Node node, int data) {
//		
//		/* 1. If the tree is empty, return a new,	
//		single node */
//		if (node == null) {
//			return (new Node(data));
//		} else {
//			
//			/* 2. Otherwise, recur down the tree */
//			if (data <= node.data) {
//				node.left = insert(node.left, data);
//			} else {
//				node.right = insert(node.right, data);
//			}
//
//			/* return the (unchanged) node pointer */
//			return node;
//		}
//	}
//
//	/* Given a non-empty binary search tree,
//	return the minimum data value found in that
//	tree. Note that the entire tree does not need
//	to be searched. */
//	int minvalue(Node node) {
//		Node current = node;
//
//		/* loop down to find the leftmost leaf */
//		while (current.left != null) {
//			current = current.left;
//		}
//		return (current.data);
//	}
//	
//	// Driver program to test above functions
//	public static void main(String[] args) {
//		FindMinimumInBST tree = new FindMinimumInBST();
//		Node root = null;
//		root = tree.insert(root, 4);
//		tree.insert(root, 2);
//		tree.insert(root, 1);
//		tree.insert(root, 3);
//		tree.insert(root, 6);
//		tree.insert(root, 5);
//
//		System.out.println("Minimum value of BST is " + tree.minvalue(root));
//	}
//}

//This code is contributed by Mayank Jaiswal

