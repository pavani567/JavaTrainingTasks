package co.wraper;

public class StringBufferEx {

	public static void main(String[] args) {
		
		String str="Pavani";
		StringBuffer sb=new StringBuffer(str);
		System.out.println(str); 
		System.out.println(sb.append(10));
		System.out.println(sb.length());
		System.out.println(sb.insert(1,"Pendyala"));
		System.out.println(sb.replace(1,3,"Pendyala"));
		System.out.println(sb.delete(1,3));
		System.out.println(sb.reverse());
		System.out.println(sb.capacity());
	    sb.ensureCapacity(10);
	    System.out.println(sb.capacity());
        sb.ensureCapacity(50);
		System.out.println(sb.capacity());
		sb.trimToSize();
		System.out.println(sb.capacity());
		
		char[] cstr = new char[] { 'a', 'e', 'i', 'o', 'u','v','w'};  
		System.out.println(sb.append(cstr, 0, 8));
		System.out.println(sb.appendCodePoint(15));
		int codepoints = str.codePointCount(4, 7);
		System.out.println(codepoints);
		

	}

}
