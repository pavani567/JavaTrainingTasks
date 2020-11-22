package co.wraper;

public class StringBuilderEx {

	public static void main(String[] args) {
		
		String str="Pavani";
		StringBuilder s=new StringBuilder(str);
		System.out.println(str); 
		System.out.println(s.append(10));
		System.out.println(s.length());
		System.out.println(s.insert(1,"Pendyala"));
		System.out.println(s.replace(1,3,"Pendyala"));
		System.out.println(s.delete(2,4));
		System.out.println(s.reverse());
		System.out.println(s.capacity());
	    s.ensureCapacity(10);
	    System.out.println(s.capacity());
        s.ensureCapacity(50);
		System.out.println(s.capacity());
		s.trimToSize();
		System.out.println(s.capacity());
		
		char[] cstr = new char[] { 'a', 'e', 'i', 'o', 'u'};  
		System.out.println(s.append(cstr, 0, 5));
		System.out.println(s.appendCodePoint(15));
		int codepoints = str.codePointCount(4, 7);
		System.out.println(codepoints);
		

	}

}
