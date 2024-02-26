package day03;

public class OopTest {
	public static void main(String[] args) {
		Animal ani = new Animal();
		System.out.println(ani.x);
		System.out.println(ani.y);
		ani.moveX(5);
		ani.moveY(-3);
		System.out.println(ani.x);
		System.out.println(ani.y);
		
	}
}
