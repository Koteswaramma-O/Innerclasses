package innerclasses;

//Outerclass
class Outercla {
	public int Outer_x = 10;
	static int Outer_y = 20;
	private static int Outer_private = 30;

	static class NestedInner {
		void display() {
			// Cannot make a static reference to the non-static field Outer_x
			// System.out.println(Outer_x);
			System.out.println(Outer_y);
			System.out.println(Outer_private);
		}
	}

}

public class StaticNestedClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outercla.NestedInner o = new Outercla.NestedInner();
		o.display();
	}

}
