package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.SkipException;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CC {

	static WebDriver driver;

	@Test(priority=1)
	public static void addBook() throws InterruptedException {
		
	WebDriverManager.chromedriver().setup();
	driver= new ChromeDriver();
	driver.get("http://practice.automationtesting.in/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//*[@id=\"menu-item-40\"]/a")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"site-logo\"]/a/img")).click();
	Thread.sleep(2000);
	JavascriptExecutor jsx = (JavascriptExecutor)driver;
	jsx.executeScript("window.scrollBy(0,450)", "");
	driver.findElement(By.xpath("//*[@id=\"text-22-sub_row_1-0-2-0-0\"]/div/ul/li/a[2]")).click();
    
	}
	@Test(priority=2)
	public static void viewBasket() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@title='View Basket']")).click();
		driver.findElement(By.xpath("//*[@id=\"page-34\"]/div/div[1]/div/div/div/a")).click();	
	}
	
	  @Test(priority=3)
	  public static void skippedMethod() {
	  
	  throw new SkipException("Skipping this exception"); }
	 
	
	@Test(priority=4)
	public static void exitSit() {
	
		driver.quit();
	}
	
	@Test(priority=5)
	public static void addBookToCart() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("http://practice.automationtesting.in/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"menu-item-40\"]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"site-logo\"]/a/img")).click();
		Thread.sleep(2000);
		JavascriptExecutor jsx = (JavascriptExecutor) driver;
		jsx.executeScript("window.scrollBy(0,450)", "");
		driver.findElement(By.xpath("//*[@id=\"text-22-sub_row_1-0-2-0-0\"]/div/ul/li/a[2]")).click();

	}

	@Test(priority=6)
	public static void BasketDetails() throws InterruptedException {
		Thread.sleep(3000);

		driver.findElement(By.xpath("//a[@title='View Basket']")).click();
		driver.findElement(By.xpath("//*[@id=\"page-34\"]/div/div[1]/div/div/div/a")).click();
	}

	@Test(priority=7)
	public static void cCode() throws InterruptedException {

		driver.findElement(By.xpath("//input[@name=\"coupon_code\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value=\"Apply Coupon\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"page-34\"]/div/div[1]/div/div/div/a")).click();

	}

	
	  @Test(priority=8)
	  public static void dskippedMethod() {
	  
	  throw new SkipException("Skipping this exception"); }
	  
	 
	@Test(priority=9)
	public static void exitSite() {
 
		driver.quit();
	}


	@Test(priority=10)
	public static void login() throws InterruptedException {
		
	WebDriverManager.chromedriver().setup();
	driver= new ChromeDriver();
	
	driver.get("https://www.saucedemo.com/");
	driver.findElement(By.id("user-name")).sendKeys("standard_user");
	Thread.sleep(1000);

	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@id=\"login-button\"]")).click();
	
	}
	
	@Test(priority=11)
	public static void addToCart() throws InterruptedException {
	
	driver.findElement(By.xpath("//a[@id=\"item_4_title_link\"]/div")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//button[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//div[@id=\"shopping_cart_container\"]/a")).click();
	
	}
	@Test(priority=12)
	public static void checkout() throws InterruptedException {

		driver.findElement(By.id("checkout")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("first-name")).sendKeys("vinay");
		Thread.sleep(1000);
		driver.findElement(By.id("last-name")).sendKeys("varma");
		driver.findElement(By.id("postal-code")).sendKeys("50016");
		Thread.sleep(1000);
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.xpath("//button[@data-test=\"finish\"]")).click();
		
		}
	
	@Test(priority=13)
	public static void teardown() {
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
}
