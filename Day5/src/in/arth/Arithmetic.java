package in.arth;

public class Arithmetic {
	
	public int add(int...x) {
		int sum=0;
		for(int i:x) {
			sum+=i;
		}
		return sum;
	}
	public int sub(int...x) {
		int dif=0;
		for(int i:x) {
			dif-=i;
		}
		return dif;
	}
	public int mult(int...x) {
		int mult=1;
		for(int i:x) {
			mult*=i;
		}
		return mult;
	}
	
	public int div(int...x) {
		int d=0;
		for(int i:x) {
			d=d/i;
		}
		return d;
	}
	public int mod(int...x) {
		int m=0;
		for(int i:x) {
			m=m%i;
		}
		return m;
	}

}
