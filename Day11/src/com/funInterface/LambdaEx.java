package com.funInterface;

public class LambdaEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FunctInterface fi=(s1,s2)->
	    {
	    System.out.println(s1.length());
	    System.out.println(s2.length());
	    };
	    fi.display("Pavani", "Pendyala");
	    fi=(s1,s2)->
	    {
	    System.out.println(s1.concat(s2));
	    };
	    fi.display("Pavani", "Pendyala");
	    fi=(s1,s2)->
	    {
	    System.out.println(s1.compareTo(s2));
	    };
	    fi.display("Pavani", "Pendyala");
	    }
	    public void display(String s1, String s2)
	    {
	   
	    }
	
}
