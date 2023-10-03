package _7_Class;

public class MyTree {
	class Node{
		Object data;
		Node right;
		Node left;
		Node(Object data){
			this.data = data;
		}
	}
	
	Node root;
	//  Method to add elements to binary tree.
	boolean add(Comparable data) {
		if(root == null) {
			root = new Node(data);
			return true;
		}
		return add(root, data);
	}
	
	boolean add(Node root, Comparable data) {
		if(data.compareTo(root.data) == 0)
			return false;
		
		if(data.compareTo(root.data) > 0) {
			if(root.right == null) {
				root.right = new Node(data);
				return true;
			}
			return add(root.right, data);
		}
		else {
			if(root.left == null) {
				root.left = new Node(data);
				return true;
			}
			return add(root.left, data);
		}
	}
	
	//  Method to display tree Elements.
	public void display(String option) {
		switch(option) {
		case "inorder" : inOrder(root);
						 break;
		case "preorder" : preOrder(root);
						 break;
		case "postorder" : postOrder(root);
						 break;
		default : System.out.println("Enter the Correct option");
		}
	}
	
	public void inOrder(Node root) {
		if(root == null) {
			return ;
		}
		inOrder(root.left);
		System.out.println(root.data + " ");
		inOrder(root.right);
	}
	
	public void preOrder(Node root) {
		if(root == null) {
			return ;
		}
		System.out.println(root.data + " ");
		preOrder(root.left);
		preOrder(root.right);
	}
	
	public void postOrder(Node root) {
		if(root == null) {
			return ;
		}
		postOrder(root.left);
		postOrder(root.right);
		System.out.println(root.data + " ");
	}
	
	//  Method to return no of elements
	int size() {
		return size(root, 0);
	}
	
	int size(Node root, int count) {
		if(root == null)
			return count;
		count++;
		count = size(root.left, count);
		count = size(root.right, count);
		return count;
	}
}