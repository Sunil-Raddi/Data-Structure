package _11_Class;

interface Circle {
	public double getArea(Double d);
}
public class MainLamda {
	public static void main(String[] args) {
		Circle cir = new Circle() {
			@Override
			public double getArea(Double d) {
				return 3.142*d*d;
			}
		};
		
		System.out.println(cir.getArea(23.0));
		
		Circle area = r -> 3.142*r*r;
		System.out.println(cir.getArea(23.0));
		
		
	}
}
