package Vista;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import Modelo.Help;

public class CreacionUsuarios {

	@Test
	public static void usuarios() throws SQLException {

		/** CONEXIÓN BD */

		/* Consulta de la información de la tabla Doctores */
//		ResultSet rs = Help.Consulta("SELECT * FROM PSL.Doctores");
		//	rs.next();

		/* Consulta de la información de la tabla Pacientes */
	//	ResultSet pac = Help.Consulta("SELECT * FROM PSL.Pacientes");
		//	pac.next();

		//String driverPath = "IE driver path";
//
//		if (rs.getString("Navegador").equals("Explorer"))
//		{
			WebDriver driver = new InternetExplorerDriver();
			driver.manage().window().maximize();
			driver.navigate().to("http://automatizacion.herokuapp.com/lgomezm/");
//		} else {
//			
//			/** INICIO */
//			WebDriver driver = new FirefoxDriver();
//			String test = "http://automatizacion.herokuapp.com/lgomezm/";
//			driver.get(test);
//			driver.manage().window().maximize();



			/** CREAR DOCTORES */

			/* Agregar Doctor */
			driver.findElement(By.linkText("Agregar Doctor")).click();

			/* Nombre Completo */
			WebElement nombreCompleto = driver.findElement(By.id("name"));
			//nombreCompleto.sendKeys(rs.getString("Nombre"));
			nombreCompleto.sendKeys("Rafael");

			/* Apellidos */
			WebElement apellidos = driver.findElement(By.id("last_name"));
			//apellidos.sendKeys(rs.getString("Apellido"));
			apellidos.sendKeys("Gutierrez Gutierrez");

			/* Telefono */
			WebElement telefono = driver.findElement(By.id("telephone"));
			telefono.sendKeys("3552627");

			/* TipoID */
			WebElement tipoID = driver.findElement(By.id("identification_type"));
			//tipoID.sendKeys(rs.getString("TipoID"));
			tipoID.sendKeys("Cédula de ciudadanía");

			/* NumeroID */
			WebElement numeroID = driver.findElement(By.id("identification"));
			//numeroID.sendKeys(rs.getString("NumeroID"));
			numeroID.sendKeys("1020455340");

			/* Botón GUARDAR */
			driver.findElement(By.linkText("Guardar")).click();

			/* Validación */
			WebElement validacionDoctor = driver.findElement(By.xpath("//div[contains(.,'Guardado')]"));
			Assert.assertTrue(validacionDoctor.getText().contains("Guardado"));

			/** Volver al Inicio */
			driver.findElement(By.linkText("Inicio")).click();


			/** CREAR PACIENTES */

			/* Agregar Paciente */
			driver.findElement(By.linkText("Agregar Paciente")).click();

			/* Nombre Completo */
			WebElement nombreCompletoP = driver.findElement(By.name("name"));
			//nombreCompletoP.sendKeys(pac.getString("Nombre"));
			nombreCompletoP.sendKeys("Luisa");

			/* Apellidos */
			WebElement apellidosP = driver.findElement(By.name("last_name"));
			//apellidosP.sendKeys(pac.getString("Apellido"));
			apellidosP.sendKeys("Gutierrez Gutierrez");

			/* Telefono */
			WebElement telefonoP = driver.findElement(By.name("telephone"));
			telefonoP.sendKeys("3552627");

			/* TipoID */
			WebElement tipoIDP = driver.findElement(By.name("identification_type"));
			//tipoIDP.sendKeys(pac.getString("TipoID"));
			tipoIDP.sendKeys("Cédula de ciudadanía");

			/* NumeroID */
			WebElement numeroIDP = driver.findElement(By.name("identification"));
			//numeroIDP.sendKeys(pac.getString("NumeroID"));
			numeroIDP.sendKeys("1030477777");

			/* Check Salud Prepagada */
			driver.findElement(By.linkText("Salud prepagada")).click();

			/* Botón GUARDAR */
			driver.findElement(By.linkText("Guardar")).click();

			/* Validación */
			WebElement validacionPac = driver.findElement(By.xpath("//div[contains(.,'Guardado')]"));
			Assert.assertTrue(validacionPac.getText().contains("Guardado"));

			/* Cerrar Navegador */
			driver.close();
		}
//	}
}