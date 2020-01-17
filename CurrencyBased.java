import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CurrencyBased {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://Users//admin//Desktop//chromedriver.exe");
		WebDriver objDriver = new ChromeDriver();
		objDriver.get("http://demo.opencart.com");
		System.out.println("Title of the page is: "+objDriver.getTitle());
		objDriver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[3]/button[1]")).click();
		objDriver.findElement(By.xpath("/html[1]/body[1]/nav[1]/div[1]/div[2]/ul[1]/li[4]/a[1]")).click();
		WebElement prod = objDriver.findElement(By.xpath("//body//form//tbody//td[2]"));
		System.out.println(prod.getText()+" is added to the Shopping Cart");
		WebElement obj1 = objDriver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/div[1]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]"));
		System.out.println("AMOUNT IN US DOLLAR IS");
		System.out.println(obj1.getText());
		System.out.println("AMOUNT IN INR");
		String temp = obj1.getText();
		temp = temp.substring(1);
		Double amount = Double.parseDouble(temp);
		System.out.println(amount*71.01+" Indian Rupees");
		objDriver.findElement(By.xpath("//button[@class='btn btn-link dropdown-toggle']")).click();
		objDriver.findElement(By.xpath("//button[@name='EUR']")).click();
		WebElement obj2 = objDriver.findElement(By.xpath("//div[@id='checkout-cart']//tbody//td[5]"));
		System.out.println("AMOUNT IN EURO IS");
		System.out.println(obj2.getText());
		objDriver.findElement(By.xpath("//button[@class='btn btn-link dropdown-toggle']")).click();
		objDriver.findElement(By.xpath("//button[@name='GBP']")).click();
		obj2 = objDriver.findElement(By.xpath("//div[@id='checkout-cart']//tbody//td[5]"));
		System.out.println("AMOUNT IN POUND IS");
		System.out.println(obj2.getText());
		objDriver.quit();

	}

}
