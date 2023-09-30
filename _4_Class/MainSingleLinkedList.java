package _4_Class;

public class MainSingleLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleLinkedList sl = new SingleLinkedList();
		sl.add(30);
		sl.add(20);
		sl.add(10);
		sl.add(50);
		sl.add(40);
		System.out.println(sl);
		sl.addFirst(5);
		System.out.println(sl);
		sl.add(60, 5);
		System.out.println(sl);
		System.out.println(sl.deleteFirst());
		System.out.println(sl);
		System.out.println(sl.deleteLast());
		System.out.println(sl);
		System.out.println(sl.delete(3));
		System.out.println(sl.sum1());
		System.out.println(sl.sum2());
		sl.reverse();
		System.out.println(sl);
		
	}

}
