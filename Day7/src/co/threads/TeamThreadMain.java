package co.threads;

public class TeamThreadMain {

	public static void main(String[] args) {
		
		ThreadGroup tg1=new ThreadGroup("velocity");
		TeamThreads tt=new TeamThreads("velocity","a");
		TeamThreads tt1=new TeamThreads("velocity","b");
		TeamThreads tt2=new TeamThreads("velocity","c");
		TeamThreads tt3=new TeamThreads("velocity","d");
		TeamThreads tt4=new TeamThreads("velocity","e");
		Thread t1=new Thread(tg1,tt,"a");
		Thread t2=new Thread(tg1,tt1,"b");
		Thread t3=new Thread(tg1,tt2,"c");
		Thread t4=new Thread(tg1,tt3,"d");
		Thread t5=new Thread(tg1,tt4,"e");
		tt=new TeamThreads("velocity","a");
		tt1=new TeamThreads("velocity","b");
		tt2=new TeamThreads("velocity","c");
		tt3=new TeamThreads("velocity","d");
		tt4=new TeamThreads("velocity","e");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		ThreadGroup tg2=new ThreadGroup("java dalias");
		TeamThreads tt5=new TeamThreads("java dalias","f");
		TeamThreads tt6=new TeamThreads("java dalias","g");
		TeamThreads tt7=new TeamThreads("java dalias","h");
		TeamThreads tt8=new TeamThreads("java dalias","i");
		TeamThreads tt9=new TeamThreads("java dalias","j");
		Thread t6=new Thread(tg2,tt5,"f");
		Thread t7=new Thread(tg2,tt6,"g");
		Thread t8=new Thread(tg2,tt7,"h");
		Thread t9=new Thread(tg2,tt8,"i");
		Thread t10=new Thread(tg2,tt9,"j");
		tt=new TeamThreads("java dalias","f");
		tt1=new TeamThreads("java dalias","g");
		tt2=new TeamThreads("java dalias","h");
		tt3=new TeamThreads("java dalias","i");
		tt4=new TeamThreads("java dalias","j");
		t6.start();
		t7.start();
		t8.start();
		t9.start();
		t10.start();
		ThreadGroup tg3=new ThreadGroup("data pirates");
		TeamThreads tt10=new TeamThreads("data pirates","k");
		TeamThreads tt11=new TeamThreads("data pirates","l");
		TeamThreads tt12=new TeamThreads("data pirates","m");
		TeamThreads tt13=new TeamThreads("data pirates","n");
		TeamThreads tt14=new TeamThreads("data pirates","o");
		Thread t11=new Thread(tg3,tt10,"k");
		Thread t12=new Thread(tg3,tt11,"l");
		Thread t13=new Thread(tg3,tt12,"m");
		Thread t14=new Thread(tg3,tt13,"n");
		Thread t15=new Thread(tg3,tt14,"o");
		tt10=new TeamThreads("data pirates","k");
		tt11=new TeamThreads("data pirates","l");
		tt12=new TeamThreads("data pirates","m");
		tt13=new TeamThreads("data pirates","n");
		tt14=new TeamThreads("data pirates","o");
		t11.start();
		t12.start();
		t13.start();
		t14.start();
		t15.start();
		ThreadGroup tg4=new ThreadGroup("team quad");
		TeamThreads tt16=new TeamThreads("quad","p");
		TeamThreads tt17=new TeamThreads("quad","q");
		TeamThreads tt18=new TeamThreads("quad","r");
		TeamThreads tt19=new TeamThreads("quad","s");
		TeamThreads tt20=new TeamThreads("quad","t");
		Thread t16=new Thread(tg4,tt16,"p");
		Thread t17=new Thread(tg4,tt17,"q");
		Thread t18=new Thread(tg4,tt18,"r");
		Thread t19=new Thread(tg4,tt19,"s");
		Thread t20=new Thread(tg4,tt20,"t");
		tt16=new TeamThreads("quad","p");
		tt17=new TeamThreads("quad","q");
		tt18=new TeamThreads("quad","r");
		tt19=new TeamThreads("quad","s");
		tt20=new TeamThreads("quad","t");
		t16.start();
		t17.start();
		t18.start();
		t19.start();
		t20.start();

	}

}
