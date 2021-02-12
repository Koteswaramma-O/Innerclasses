package innerclasses;

class  OuterClass {
	void outerMethod() {
		/*
		 * Local inner class cannot access non-final local variable till JDK 1.7. Since
		 * JDK 1.8. it is possible to access the non-final local variable in method
		 * local inner class.
		 * 
		 */
		final int a = 1;
		System.out.println("inside outerMethod");
		// Here Inner class is local to outerMethod()
		class Inner {
			void InnerMetod() {
				System.out.println("a is :" + a);
				System.out.println("inside InnerMethod");
			}
		}
		Inner i = new Inner();
		i.InnerMetod();
	}
}

public class MethodLoacl {

	public static void main(String[] args) {
		OuterClass o = new OuterClass();
		o.outerMethod();

	}

}
