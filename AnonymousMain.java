package innerclasses;

/*Anonymous classes implemented in to ways
 * 1.classes(abstract or concrete).
 * 2.interfaces
 * 
 */

//  here anonymous class implementing interface 

interface Age {
	int x = 21;
	void getAge();
}

public class AnonymousMain {
	static Age a = new Age() {
		@Override
		public void getAge() {
			System.out.println("Age is :" + x);
		}
	};

	public static void main(String[] args) {
		a.getAge();
	}

}
