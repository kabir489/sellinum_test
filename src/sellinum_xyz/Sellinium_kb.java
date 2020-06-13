package sellinum_xyz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sellinium_kb {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\19292\\eclipse-workspace\\seleniumpractice\\jars\\chromedriver_win32\\chromedriver.exe");		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
//		System.out.println("this is the current URL: "+driver.getCurrentUrl());
//		System.out.println("this is the current page title: "+driver.getTitle());

//		if(driver.getTitle().equalsIgnoreCase("Facebook- Log In or Sign Up")) {
	//	
//			System.out.println("this is the right title page");
//		}
//		else 
//		{	
//			System.out.println("this is not...right title page");
	//	
//		}
		
		//facebook login using xpath technique for find the element
		
//		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("kabirgmg@yahoo.com");
//		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("December2003");
//		driver.findElement(By.xpath("//*[@id=\"u_0_b\"]")).click();

		
		//facebook login using custom xpath//tagname[@attributes='value']
		
//		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("kabirgmg@yahoo.com");
//		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("December2003");
//		driver.findElement(By.xpath("//input[@id='u_0_b']")).click();

		//facebook login using ID technique
		
//		driver.findElement(By.id("email")).sendKeys("kabirgmg@yahoo.com");
//		driver.findElement(By.id("pass")).sendKeys("December2003");
//		driver.findElement(By.id("u_0_b")).click();
		
		
		//facebook login using Name Technique
		
//		driver.findElement(By.name("email")).sendKeys("kabirgmgyahoo.com");
//		driver.findElement(By.name("pass")).sendKeys("december2003");

		
		
		
		
		//LinkText Technique	
//		driver.findElement(By.linkText("Forgot account?")).click();
		
		//PArtial Link Technique
//		driver.findElement(By.partialLinkText("Forgot")).click();
		
		
		//facebook signup using xpath technique
		
//		driver.findElement(By.xpath("//*[@id=\"u_0_m\"]")).sendKeys("Mohammed");
//		driver.findElement(By.xpath("//*[@id=\"u_0_o\"]")).sendKeys("Kabir");
//		driver.findElement(By.xpath("//*[@id=\"u_0_r\"]")).sendKeys("kabir.uddin10021976@gmail.com");	
//		driver.findElement(By.xpath("//*[@id=\"u_0_u\"]")).sendKeys("kabir.uddin10021976@gmail.com");
//		driver.findElement(By.xpath("//*[@id=\"u_0_w\"]")).sendKeys("Convid-19");
	//	
	//	
//		//Select DropDown List
	//	
//		WebElement elem=driver.findElement(By.xpath("//*[@id=\"month\"]"));
//		WebElement eled=driver.findElement(By.xpath("//*[@id=\"day\"]"));
//		WebElement eley=driver.findElement(By.xpath("//*[@id=\"year\"]"));
		
//		Select selm=new Select(elem);
//		Select seld=new Select(eled);
//		Select sely=new Select(eley);
	//	
	//	
	//	
//		selm.selectByVisibleText("Oct");
//		seld.selectByIndex(2);
//		sely.selectByValue("1976");
		
		
		// Select Radio Button
		driver.findElement(By.xpath("//*[@id=\"u_0_z\"]/span[2]/label")).click();
		
		// select submit button
		
		driver.findElement(By.xpath("//*[@id=\"u_0_13\"]")).click();
		
		// successfully Sign Up done.
		}
		


	}

