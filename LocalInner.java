package innerclasses;

//LocalInner is acts as Outerclass
public class LocalInner {
	public void getValue() {
		int sum = 20;
		// Inner classes can't be static
		class Inner {
			public int divisor;
			public int remainder;

			// Inner class Constructor
			public Inner() {
				divisor = 4;
				remainder = sum % divisor;
			}

			private int getDivisor() {
				return divisor;
			}

			private int getRemainder() {
				return sum % divisor;
			}

			private int getQuotient() {
				System.out.println("Inside inner class");
				return sum / divisor;
			}

		}
		Inner i = new Inner();
		System.out.println("Divisor :" + i.getDivisor());
		System.out.println("Remainder :" + i.getRemainder());
		System.out.println("Quotient :" + i.getQuotient());

	}

	public static void main(String[] args) {
		LocalInner outer = new LocalInner();
		outer.getValue();
	}

}

//inner class inside if condition
class outerc {
	public int data = 10;

	public int getData() {
		return data;
	}

	public static void main(String[] args) {
		outerc o = new outerc();
		if (o.getData() < 20) {
			class Inner {
				public int getValue() {
					System.out.println("Inside Inner class");
					return o.data;
				}
			}
			Inner inner = new Inner();
			System.out.println(inner.getValue());
		} else {
			System.out.println("Inside Outer class");
		}
	}
}