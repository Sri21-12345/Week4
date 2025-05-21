package week4.day1;

public class Overloading1 extends Overloading {
	//subclass extends superclass
	//method
	public void reportstep(String message1, String status1)
	{
		System.out.println("Message1"+message1);
		System.out.println("Status1"+status1);
	}

	public static void main(String[] args) {
		Overloading1 OL1=new Overloading1();
		OL1.reportstep("Answer3","Stable");

	}

}
