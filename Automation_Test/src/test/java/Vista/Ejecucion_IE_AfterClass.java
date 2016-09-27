package Vista;

import java.sql.SQLException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;

public class Ejecucion_IE_AfterClass {


	@SuppressWarnings("null")
	@AfterClass
	public static void tearDown() throws SQLException {

		/** CONEXIÓN BD */
		/* Consulta de la información de la tabla Doctores */
		//		ResultSet rs = Help.Consulta("SELECT * FROM PSL.Doctores");
		//		rs.next();

		WebDriver driver = null;

//		if (rs.getString("Navegador").equals("Explorer"))
//		{
			if(driver==null) {
				System.out.println("Closing IE browser");
				driver.quit();
			}
//		}
	}

}