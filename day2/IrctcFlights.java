package week4.day2;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IrctcFlights {
	public static void main(String[] args){
		ChromeOptions options=new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver=new ChromeDriver(options);
    driver.get("https://www.irctc.co.in/");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    
    String irctcWindow = driver.getWindowHandle();
    	System.out.println(irctcWindow );
	System.out.println(driver.getTitle());
	
    // Requirement steps
   driver.findElement(By.xpath("//span[@class='allcircle circleone']")).click();
   
	String flightWindow = driver.getWindowHandle();
	  System.out.println(flightWindow); 
	  System.out.println(driver.getTitle());
	  driver.close();
	  driver.quit();
	  } }