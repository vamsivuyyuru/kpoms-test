import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class admin {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","E://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://13.232.65.248:8080/kumar/");
		
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("admin");
		driver.findElement(By.xpath(".//*[@id='submit1']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath(".//*[@id='horizontal-navbar']/ul/li[2]/a/span")).click();
		Thread.sleep(1000);
	
		driver.findElement(By.xpath(".//*[@id='horizontal-navbar']/ul/li[3]/a/span")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='horizontal-navbar']/ul/li[4]/a/span")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='horizontal-navbar']/ul/li[5]/a/span")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='horizontal-navbar']/ul/li[6]/a/span")).click();
		driver.findElement(By.xpath("html/body/header/div[2]/ul/li/a/span/i")).click();
		driver.findElement(By.xpath("html/body/header/div[2]/ul/li/ul/li[2]/ul/li[1]/a")).click();
		driver.findElement(By.id("password")).sendKeys("admin");
		Thread.sleep(3000);
		driver.findElement(By.id("npassword")).sendKeys("admin");
		driver.findElement(By.id("cpassword")).sendKeys("admin");
		driver.findElement(By.id("submit4")).click();
		Thread.sleep(10000);
		driver.quit();
		
		
		
	}

}
