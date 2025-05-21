package week4.day1;

public class Overloading {
	//Method calling with input arguments
	public void reportStep(String msg, String status) {
		System.out.println("Message:"+ msg);
		System.out.println("Status:"+ status);
	}
	
	public void reportStep(String msg,String status,boolean snap) {
		System.out.println("Message:"+ msg);
		System.out.println("Status:"+ status);
		System.out.println("Take a Snap"+snap);	}
	
	public static void main(String[] args) {
		Overloading OL=new Overloading();
		OL.reportStep("Answer","Active");
		OL.reportStep("Answer1", "Inactive", true);

	}

}
