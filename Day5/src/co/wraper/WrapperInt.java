package co.wraper;

public class WrapperInt {

	public static void main(String[] args) {
		
		 int a=10;
	       int c=12;
	       Integer x=new Integer(a);
	       Integer y=new Integer(c);
	       System.out.println(Integer.bitCount(a));//print no of ones in binary form 
	       Integer a1 = new Integer(257); 
	        byte b = a1.byteValue(); // Convert Integer number to byte value (0 to 256)
	        System.out.println(b); 
	        System.out.println(Integer.compare(a, b));// the value 0 if x == y; a value less than 0 if x < y as unsigned values; and a value greater than 0 if x > y as unsigned values
	        System.out.println(x.compareTo(y));//returns equal or not
	        
	        String str="005";
	        System.out.println(Integer.decode(str));
	        System.out.println(Integer.divideUnsigned(x,y));
	        System.out.println(x.doubleValue());
	        System.out.println(x.equals(y));
	        System.out.println(x.floatValue());
	        String str1="10";
	      
	        System.out.println(Integer.getInteger(str1));
	        System.out.println(Integer.getInteger(str1,a));
	        // toString() 
	        System.out.println( Integer.toString(x)); 
	  
	        // toHexString(),toOctalString(),toBinaryString() 
	        // converts into hexadecimal, octal and binary forms. 
	        System.out.println( Integer.toHexString(x)); 
	        System.out.println( Integer.toOctalString(y)); 
	        System.out.println( Integer.toBinaryString(x)); 
	        Integer z = Integer.valueOf(x); 
	        System.out.println( z); 
	        System.out.println(Integer.valueOf(str, 6)); 
	  
	        // parseInt(): return primitive int value 
	        // an overloaded method takes radix as well 
	        int zz = Integer.parseInt(str); 
	        System.out.println("parseInt(str) = " + zz); 
	        zz = Integer.parseInt(str1, 2); 
	        System.out.println("parseInt(str1,2) = " + zz); 
	        System.out.println("bytevalue(x) = " + x.byteValue()); 
	        System.out.println("shortvalue(x) = " + x.shortValue()); 
	        System.out.println("intvalue(x) = " + x.intValue()); 
	        System.out.println("longvalue(x) = " + x.longValue()); 
	        System.out.println("doublevalue(x) = " + x.doubleValue()); 
	        System.out.println("floatvalue(x) = " + x.floatValue()); 
	          
	         
	          
	        // numberOfTrailingZeroes and numberOfLeaadingZeroes 
	        // can be used to count prefix and postfix sequence of 0 
	        System.out.println( Integer.numberOfTrailingZeros(a)); 
	        System.out.println(Integer.numberOfLeadingZeros(a)); 
	          
	        //highestOneBit returns a value with one on highest  
	        //set bit position 
	        System.out.println(Integer.highestOneBit(b)); 
	          
	        // highestOneBit returns a value with one on lowest  
	        // set bit position 
	        System.out.println(Integer.lowestOneBit(c)); 
	          
	        // reverse() can be used to reverse order of bits 
	        // reverseBytes() can be used to reverse order of bytes 
	        System.out.println("Integer.reverse(value)=" +  
	                                   Integer.reverse(x)); 
	        System.out.println("Integer.reverseBytes(value)=" +  
	                                   Integer.reverseBytes(y)); 
	          
	        // signum() returns -1,0,1 for negative,0 and positive  
	        // values 
	        System.out.println("Integer.signum(value)=" + Integer.signum(a)); 
	      
	        // hash code() returns hash code of the object 
	        
	        System.out.println( Integer.hashCode(a));     

	}

}
