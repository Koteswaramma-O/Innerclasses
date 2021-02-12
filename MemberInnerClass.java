package innerclasses;

public class MemberInnerClass {
	private int a = 10;

	public class Inner {
		void innerMethod() {
			System.out.println("Inner Method");
			System.out.println("a is :" + a);
		}

	}

	public class Outer {
		void outerMethod() {
			System.out.println("outer method");
			System.out.println("a is :" + a);
		}

	}

	void outerMethod1() {
		System.out.println("outerMethod1");
	}

	public static void main(String[] args) {
		MemberInnerClass obj = new MemberInnerClass();
		obj.outerMethod1();
		MemberInnerClass.Outer outer = new MemberInnerClass().new Outer();
		outer.outerMethod();
		MemberInnerClass.Inner inner = new MemberInnerClass().new Inner();
		inner.innerMethod();
	}

}
