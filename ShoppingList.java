package week3.day2;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ShoppingList {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		LinkedHashSet<String> linkedset = new LinkedHashSet<String>();
		LinkedHashSet<String> linkedset1 = new LinkedHashSet<String>();
		// ArrayList<Integer> list = new ArrayList<Integer>();

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("searchVal")).sendKeys("bags");
		driver.findElement(By.name("searchVal")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
		Thread.sleep(1000);
		String items = driver.findElement(By.xpath("//div[@class='length']")).getText();
		System.out.println(items);
		Thread.sleep(1000);
		List<WebElement> m = driver.findElements(By.xpath("(//div[@class='brand'])"));
		for (int i = 0; i < m.size(); i++) {
			String s = m.get(i).getText();
			linkedset.add(s);
		}
		System.out.println(linkedset);
		System.out.println(linkedset.size());
		List<WebElement> m1 = driver.findElements(By.xpath("(//div[@class='nameCls'])"));
		for (int i = 0; i < m1.size(); i++) {
			String s1 = m1.get(i).getText();
			linkedset1.add(s1);
		}

		System.out.println(linkedset1);
		System.out.println(linkedset1.size());

	}
}
