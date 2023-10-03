package _7_Class;

public class MainTree {
	public static void main(String[] args) {
		MyTree mt = new MyTree();
		mt.add(29);
		mt.add(35);
		mt.add(43);
		mt.add(28);
		mt.add(32);
		mt.add(23);
		mt.add(25);
		mt.display("inorder");
		System.out.println();
		System.out.println("Number of Nodes: " + mt.size());
	}
}
