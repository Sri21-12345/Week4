package week4.day1;

public class LoginPagePolymorphisimOverriding extends BasepagePolymorphisimOverriding{
	//subclass

		//Method1
		public void UserName() {
			System.out.println("User Name:");
		}
		
		// Method2
		public void Password() {
			System.out.println("Password:");
		}
		
		//Method3
		public void ForgetPassword() {
			System.out.println("Forgot the password:");
		}
		
		//Override Method
		public void performCommonTasks() {
		System.out.println("Overridden Method"+" "+"Click the Login Button");
		}
		
		public static void main(String[] args) {
			//object created for main class for the subclass
			LoginPagePolymorphisimOverriding lppo =new LoginPagePolymorphisimOverriding();
			lppo.UserName();
			lppo.Password();
			lppo.ForgetPassword();
			lppo.performCommonTasks();
		}

	}
