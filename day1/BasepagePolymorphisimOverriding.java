package week4.day1;

public class BasepagePolymorphisimOverriding {
	//superclass
	// Method1
		public void  findElement() {
			System.out.println("Find the Element");
		}
		
		// Method2
		public void clickElement() {
			System.out.println("Click the Particular Element");
		}
		
		// Method3
		public void  enterText() {
			System.out.println("Enter the text of that Element");
		}
		
		// Method4
		public void performCommonTasks() {
			System.out.println("Create Xpath for that Element");
		}
		
	public static void main(String[] args) {
		////object created for main class for the superclass
		BasepagePolymorphisimOverriding basepage=new BasepagePolymorphisimOverriding();
		basepage.findElement();
		basepage.clickElement();
		basepage.enterText();
		basepage.performCommonTasks();
	}
	}