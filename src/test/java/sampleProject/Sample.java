package sampleProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
	public static void main(String[]args) {
		WebDriver driver=new ChromeDriver();
		driver.get("www.google.com");
		System.out.println("Test Sample");
		//System.out.println("Sample Testing");
	}

}
