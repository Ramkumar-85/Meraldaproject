package newsel;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Meraldajewellers {
	public static void main(String []args)throws InterruptedException{
		String Year="1992";
		String month= "Sep";
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramk\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://meralda.scalenext.io/user/register");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.name("first_name")).sendKeys("RamKumar");
		driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("KV");
		driver.findElement(By.name("email")).sendKeys("ramukmar189@gmail.com");
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("8611215548");
		
		JavascriptExecutor jse= (JavascriptExecutor) driver;
	    jse.executeScript("window.scrollBy(0,200)");
	    
		driver.findElement(By.name("date")).click();
		Thread.sleep(2000);
		
	    while(true){
		 String text= driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/span[1]/button[1]")).getText();
		if(text.equals(month)){
			break;
		    }else{
		    	  driver.findElement(By.className("mx-icon-left")).click();
		         }
		}
		
		while(true){
			String DOByear= driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/span[1]/button[2]")).getText();
			if(DOByear.equals(Year)){
				break;
			}else{
				 driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[1]/div[1]/button[1]/i[1]")).click();
	             }
		}
		
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr/td/div[1][contains(text(),\"17\")]")).click();
		
		driver.findElement(By.name("password")).sendKeys("Searchingforjob");
		driver.findElement(By.xpath("//input[@placeholder='Confirm password']")).sendKeys("Searchingforjob");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		System.out.println("Registered successfully");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/header[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[2]/a[1]/img[1]")).click();
        driver.findElement(By.linkText("Logout")).click();
        Thread.sleep(2000);
        System.out.println("Logged out successfully");
        System.out.println("Logged in successfully");
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/header[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[2]/a[1]/img[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("username")).sendKeys("8611215548");
        driver.findElement(By.name("password")).sendKeys("Searchingforjob");
        driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
        driver.close();
        
}
	}

