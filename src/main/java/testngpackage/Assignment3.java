package testngpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment3 {

	public static String URL = "https://www.google.com/";

	public static WebDriver driver;

	public static Actions act;

	@BeforeSuite

	public static void setup() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get(URL);

		driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);
	}

	@AfterSuite

	public static void windup() {

		driver.quit();
	}

	@Test

	public void launchapp() {

		driver.findElement(By.xpath("/html/body")).click();

		String MainWindow = driver.getWindowHandle();

		driver.switchTo().window(MainWindow);
	}

	@Test(priority =1)

	 public void test01() throws Exception {

	 driver.findElement(By.id("APjFqb")).sendKeys("Selenium");

	 driver.findElement(By.name("btnK")).click();

	 driver.navigate().back();}

	@Test(priority = 2)

	public void test02() throws Exception {

		driver.findElement(By.id("APjFqb")).sendKeys("Java");

		driver.findElement(By.name("btnK")).click();

		driver.navigate().back();

		Thread.sleep(2000);
	}

	@Test(priority=3)

	 public void test03() throws Exception{

	 driver.findElement(By.id("APjFqb")).sendKeys("Testing Concept");

	 driver.findElement(By.name("btnK")).click();

	 driver.navigate().back();

	 Thread.sleep(2000);

}

	

	

}
