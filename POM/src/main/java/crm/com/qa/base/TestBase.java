package crm.com.qa.base;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestBase {
	public static WebDriver driver;
	public static Properties prop;
	
 public TestBase() {
	 try {
	 prop=new Properties();
FileInputStream ip=new FileInputStream("C:\\Users\\Radhika\\Desktop\\POM\\src\\main\\java\\crm\\com\\qa\\conf\\config.properties");
	prop.load(ip);
	 }
	 catch(FileNotFoundException e) {
		 e.printStackTrace();
	 }catch(IOException e) {
		 e.printStackTrace();                  }}
	 public static void initialization() {
		 String browserName=prop.getProperty("browser");
		 if(browserName.contentEquals("chrome")) {
			 System.setProperty("webdriver.chrome.driver","C:\\Users\\Radhika\\Desktop\\chromey\\chromedriver.exe");
			 driver= new ChromeDriver();
		 }
		 driver.get(prop.getProperty("url"));
		 driver.manage().window().maximize();
		 
	 }}

