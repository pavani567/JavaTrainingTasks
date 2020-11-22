package co.wraper;
import java.util.Scanner;
public class Wrapper {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter first boolean value");
		boolean a = s.nextBoolean();
		System.out.println("Enter second boolean value");
		boolean b = s.nextBoolean();
		int hashCode1 = Boolean.hashCode(a);
		int hashCode2 = Boolean.hashCode(b);
		System.out.println(hashCode1);
		System.out.println(hashCode2);

		boolean logicalAnd = Boolean.logicalAnd(a, b);
		System.out.println(logicalAnd);
		boolean logicalOr = Boolean.logicalOr(a, b);
		System.out.println(logicalOr);
		boolean logicalXor = Boolean.logicalXor(a, b);
		System.out.println(logicalXor);
		int compare=Boolean.compare(a, b);
		System.out.println(compare);
		
		boolean parseBoolean=Boolean.parseBoolean("True");
		System.out.println(parseBoolean);
		boolean parseBoolean1=Boolean.parseBoolean("yes");
		System.out.println(parseBoolean1);
		
		s.close();
		
	}

}
