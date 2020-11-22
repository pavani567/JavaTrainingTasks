package co.wraper;

public class StringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str=new String("Pavani");
		
		char charAt=str.charAt(0);
		System.out.println("Character At:"+charAt);
		
		String concat=str.concat("villa");
		System.out.println("Concat:"+concat);
		
		int compareTo=str.compareTo("Bhagya");
		System.out.println("Compare to:"+compareTo);
		
		boolean endsWith=str.endsWith("i");
		System.out.println("Ends with:"+endsWith);
		
		int indexOf=str.indexOf("abc");
		System.out.println("index of:"+indexOf);
		
		boolean isEmpty=str.isEmpty();
		System.out.println("is empty:"+isEmpty);
		
		String intern=str.intern();
		System.out.println("Intern:"+intern);
		
		int length=str.length();
		System.out.println("Length:"+length);
		
		String replace=str.replace('P','R');
		System.out.println("Replace:"+replace);
		
		String toUpperCase=str.toUpperCase();
		System.out.println("to upper case:"+toUpperCase);
		
		String toLowerCase=str.toLowerCase();
		System.out.println("to upper case:"+toLowerCase);

	}

}
