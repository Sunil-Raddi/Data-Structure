package _4_Class;

public class MainDoubleLinkedList {

	public static void main(String[] args) {
		DoubleLinkedList dl = new DoubleLinkedList();
		dl.add(12);
		dl.add(22);
		dl.add(2);
		dl.add(42);
		dl.add(52);
		dl.add(62);
		System.out.println(dl.deleteFirst());
		System.out.println(dl.deleteLast());
		System.out.println(dl);
		System.out.println(dl.delete1(1));
		System.out.println(dl);
	}

}
