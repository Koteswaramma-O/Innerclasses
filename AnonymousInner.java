package innerclasses;

class Demo {
	void show() {
		System.out.println("show method in super class");
	}
}

public class AnonymousInner {

	static Demo d = new Demo() {
		void show() {
			super.show();
			System.out.println("show method in AnonymousInner class");
		}
	};

	public static void main(String[] args) {
		d.show();
	}

}
