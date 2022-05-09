package com.adactin.baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class New_Base_Class {
	
public static WebDriver driver; // --> null
	
	public static String value;

	public static WebDriver getBrowser(String type) {

		if (type.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\driver\\chromedriver_win32\\chromedriver.exe");

			driver = new ChromeDriver();

		}

		else if (type.equalsIgnoreCase("firefox")) {

			System.setProperty("webdriver.gecko.driver",
					System.getProperty("user.dir") + "\\driver\\firefox\\geckodriver.exe");

			driver = new FirefoxDriver();

		}

		driver.manage().window().maximize();

		return driver;

	}

	public static void getUrl(String url) {

		driver.get(url);

	}

	public static void clickOnElement(WebElement element) {

		element.click();

	}

	public static void inputValueElement(WebElement element, String value) {

		element.sendKeys(value);

	}

	public static WebDriver close() {

		driver.close();
		return driver;

	}

	public static void quit() {

		driver.quit();

	}

	public static void dropDown(WebElement element, String type, String value) {

		Select s = new Select(element);

		if (type.equalsIgnoreCase("byValue")) {

			s.selectByValue(value);

		}

		else if (type.equalsIgnoreCase("byIndex")) {

			int data = Integer.parseInt(value);

			s.selectByIndex(data);

		}

		else if (type.equalsIgnoreCase("byVisibleText")) {

			s.selectByVisibleText(value);

		}

	}

	public static void navigateTo(String url) {

		driver.navigate().to(url);

	}

	public static void navigateBack() {

		driver.navigate().back();

	}

	public static void navigateForward() {

		driver.navigate().forward();

	}

	public static void navigateRefresh() {

		driver.navigate().refresh();

	}

	public static void getTitle() {

		String title = driver.getTitle();

		System.out.println(title);

	}

	public static void getCurrentUrl() {

		String currentUrl = driver.getCurrentUrl();

		System.out.println(currentUrl);

	}

	public static void takeScreenShot(String path) throws IOException {

		TakesScreenshot ts = (TakesScreenshot) driver;

		File source = ts.getScreenshotAs(OutputType.FILE);

		File destination = new File(path);

		FileUtils.copyFile(source, destination);

	}

	public static void implicitlyWaitMethod(long sec) {

		driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);

	}

	public static void explicitWaitMethod(long sec, WebElement element) {

		WebDriverWait wait = new WebDriverWait(driver, sec);

		wait.until(ExpectedConditions.visibilityOf(element));

	}

	public static void simpleAlert(WebElement element) {

		element.click();

		driver.switchTo().alert().accept();

	}

	public static void confirmAlert(WebElement element, String type) {

		element.click();

		if (type.equalsIgnoreCase("ok")) {

			driver.switchTo().alert().accept();

		}

		else if (type.equalsIgnoreCase("cancel")) {

			driver.switchTo().alert().dismiss();

		}

	}

	public static void promptAlert(WebElement element, String type, String value) {

		element.click();

		if (type.equalsIgnoreCase("ok")) {

			driver.switchTo().alert().sendKeys(value);

			driver.switchTo().alert().accept();

		}

		else if (type.equalsIgnoreCase("cancel")) {

			driver.switchTo().alert().dismiss();

		}

	}

	public static void frames(WebElement element, String type) {

		if (type.equalsIgnoreCase("frame")) {

			driver.switchTo().frame(element);

		}

		else if (type.equalsIgnoreCase("noframe")) {

			driver.switchTo().defaultContent();

		}

	}

	public static void getText(WebElement element) {

		System.out.println(element.getText());

	}

	public static void isEnabled(WebElement element) {

		System.out.println(element.isEnabled());

	}

	public static void isDisplayed(WebElement element) {

		System.out.println(element.isDisplayed());

	}

	public static void isSelected(WebElement element) {

		System.out.println(element.isSelected());

	}

	public static void checkBox(WebElement element) {

		element.click();

		System.out.println("Is Checkbox Selected : " + element.isSelected());

	}

	public static void radioButton(WebElement element) {

		element.click();

		System.out.println("Is Radio Button Selected : " + element.isSelected());

	}

	public static void isMultiple(WebElement element) {

		Select s = new Select(element);

		boolean multiple = s.isMultiple();

		System.out.println("To Check Multiple : " + multiple);
	}

	public static void getOptions(WebElement element) {

		Select s = new Select(element);

		List<WebElement> options = s.getOptions();

		for (WebElement s1 : options) {

			System.out.println("Get Options : " + s1.getText());

		}

	}

	public static void getFirstSelectedOptions(WebElement element) {

		Select s = new Select(element);

		WebElement firstSelectedOption = s.getFirstSelectedOption();

		System.out.println("Get First Selected Options : " + firstSelectedOption.getText());

	}

	public static void getAllSelectedOptions(WebElement element) {

		Select s = new Select(element);

		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();

		for (WebElement s1 : allSelectedOptions) {

			System.out.println("Get All Selected Options : " + s1.getText());

		}

	}

	public static void dragAndDrop(WebElement source, WebElement target) {

		Actions a = new Actions(driver);

		a.dragAndDrop(source, target).build().perform();

	}

	public static void contextClick(WebElement element) {

		Actions a = new Actions(driver);

		a.contextClick(element).build().perform();

	}

	public static void clickAndHold(WebElement element) {

		Actions a = new Actions(driver);

		a.clickAndHold(element).build().perform();

	}

	public static void moveToElement(WebElement element) {

		Actions a = new Actions(driver);

		a.moveToElement(element).build().perform();

	}

	public static void release(WebElement element) {

		Actions a = new Actions(driver);

		a.release(element).build().perform();

	}

	public static void windowHandles(String title) {

		Set<String> windowHandles = driver.getWindowHandles();

		for (String s1 : windowHandles) {

			System.out.println(driver.switchTo().window(s1).getTitle());

		}

		String s = title;

		for (String s2 : windowHandles) {

			if (driver.switchTo().window(s2).getTitle().equalsIgnoreCase(s)) {

				break;

			}

		}

	}

	public static void robot() throws AWTException {

		Robot r = new Robot();

		r.keyPress(KeyEvent.VK_DOWN);

		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_ENTER);

		r.keyRelease(KeyEvent.VK_ENTER);

	}

	public static void scrollUpAndDown(int a, int b) {

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(" + a + ", " + b + ")");

	}

	public static String getAttribute(WebElement element, String type, String identity) {

		if (type.equalsIgnoreCase("value")) {

			System.out.println(element.getAttribute(type));

		}

		else {

			System.out.println(element.getAttribute(identity));

		}

		return identity;

	}
	
	public static String read_Data(String path, int row_Index, int cell_Index) throws IOException {
		
		File f = new File(path);
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(fis);
		
		Sheet sheetAt = wb.getSheetAt(2);
		
		Row row = sheetAt.getRow(row_Index);
		
		Cell cell = row.getCell(cell_Index);
		
		CellType cellType = cell.getCellType();
		
		if (cellType.equals(cellType.STRING)){

			value = cell.getStringCellValue();
			
		}
		
		else if (cellType.equals(cellType.NUMERIC)) {
			
			double numericCellValue = cell.getNumericCellValue();
			
			int data = (int) numericCellValue;
			
			value = String.valueOf(data);
			
		}
		
		return value;
		
	}


}
