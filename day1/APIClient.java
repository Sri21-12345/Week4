package week4.day1;

public class APIClient {
	
	//Method1 
	public void sendRequest(String endpoint) {
	System.out.println("Connected to the API:"+endpoint);

	}
	//Method2 
	public void sendRequest(String endpoint,String requestBody,Boolean requestStatus) {
	System.out.println("Connected to the API in Method2:"+endpoint);
	System.out.println("Method2 Request Body:"+requestBody);
	System.out.println("Connection Status Active:"+requestStatus);
	}
	
	public static void main(String[] args) {
		//object creation 
		APIClient API =new APIClient();

		//Method overloading 
		API.sendRequest("Method1");
		API.sendRequest("Connected", "Coding Part", true);
	}

}
	