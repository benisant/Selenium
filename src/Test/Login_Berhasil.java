package Test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;

public class Login_Berhasil {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
  	
    WebDriver driver = new ChromeDriver();
	     String baseUrl = "http://demo.guru99.com/test/newtours/";
	     String expectedTitle = "Welcome: Mercury Tours";
	     String actualTitle = "";

	        // launch Fire fox and direct it to the Base URL
	        driver.get(baseUrl);

	        // get the actual value of the title
	        actualTitle = driver.getTitle();

	 
	        if (actualTitle.contentEquals(expectedTitle)){
	            System.out.println("Test Passed!");
	        } else {
	            System.out.println("Test Failed");
	        }
	       
	        //close Fire fox
	        driver.close();
	       
	    }

	}