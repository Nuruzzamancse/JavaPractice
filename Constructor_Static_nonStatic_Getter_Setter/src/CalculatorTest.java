import java.util.Scanner;  



public class CalculatorTest {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int rollno=scan.nextInt();

		
		int num = 2;
		
		int square = Calculator.square(num);
		
		Calculator clt1 = new Calculator();
		Calculator clt2 = new Calculator();
		
		clt1.number = 72;
		
		clt2.number = 20;
		
		System.out.println(clt1.number);
		
		System.out.println(clt2.number);
		
		
		System.out.println(square);
		
		System.out.println(clt1.a);

	}

}
