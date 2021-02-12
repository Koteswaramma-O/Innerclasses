package innerclasses;

/*Nested classes are divided into two categories:
 * 1.static nested classes
 * 2.Membrane class.
 * 3.inner classes
 *   There are two special kinds of inner classes :
 *    a)Local Inner class
 *    b)Anonymous Inner class
 *       here also we have to types:
 *        1)Extending Thread Class
 *        2)implementing runnable Interface.
 */

//non-static Nested Inner class
class Outer {
	class Inner {
		public void show() {
			System.out.println("Inner class class method");
		}
	}
}

public class Main {
	public static void main(String[] args) {
		Outer.Inner in = new Outer().new Inner();
		in.show();

	}

}
