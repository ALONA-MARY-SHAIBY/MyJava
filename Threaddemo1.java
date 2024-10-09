package Module4;
class Mythread extends Thread{
	String name;
	Mythread(String name){
		this.name=name;
	}
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Thread "+name+"with i="+i+"...is running");
		}
	}
}
public class Threaddemo1 {
	public static void main(String[] args) {
		//Thread demo
		Mythread t=new Mythread("one");
		t.start();
		Mythread t1=new Mythread("two");
		t1.start();
		

	}

}
