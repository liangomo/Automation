package Vista;

import java.sql.SQLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeClass;

public class Ejecucion_IE_BeforeClass {

	@BeforeClass
	public static void setUp() throws SQLException {

		WebDriver driver;
		System.out.println("*******************");
		System.out.println("launching IE browser");
		System.setProperty("webdriver.ie.driver", "D:\\WORKSPACE\\Repository\\Automation_Test\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		driver.manage().window().maximize();
	}
}