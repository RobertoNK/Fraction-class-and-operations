
public class borrador3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fraction f1 = new Fraction(2,3);
		Fraction f2 = new Fraction();
		Fraction f3 = new Fraction(12);
		
		System.out.println(f2.getDenominator());
		System.out.println(f3.getDenominator());
		
		System.out.println(f1.subtract(f2).toString());
		System.out.println(f1.multiply(f2).toString());
		System.out.println(f1.divide(f3).toString());
	}

}
