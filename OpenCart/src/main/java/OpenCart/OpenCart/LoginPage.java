package OpenCart.OpenCart;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

	public static void main(String[] args) throws IOException {

		File file = new File(System.getProperty("user.dir") + "\\resources\\OpenCartLogin.xlsx");

		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook book = new XSSFWorkbook(fis);
		XSSFSheet sheet = book.getSheetAt(0);
		XSSFRow row;
		XSSFCell cell; // XSSF Uname = row.g //XSSFCell pass= row.getCell(0);

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.opencart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Demo']")).click();
		driver.findElement(By.xpath("//a[@href='http://demo.opencart.com/']")).click();

	}

}
