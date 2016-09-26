package Vista;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import Modelo.Help;

public class AgendarCita {

	@Test
	public static void citas () throws SQLException {

		/** CONEXIÓN BD */
		/* Consulta de la información de la tabla Doctores */
		ResultSet rs = Help.Consulta("SELECT * FROM PSL.Citas");
		rs.next();


		/** INICIO */
		WebDriver driver = new FirefoxDriver();
		String test = "http://automatizacion.herokuapp.com/lgomezm/";
		driver.get(test);
		driver.manage().window().maximize();


		/** CREAR DOCTORES */

		/* Agregar Doctor */
		driver.findElement(By.linkText("Agregar Cita")).click();

		/* Día de la Cita */
		WebElement diaCita = driver.findElement(By.id("name"));
		//diaCita.sendKeys(rs.getString("Fecha"));
		diaCita.sendKeys("10/30/2016");

		/* NumeroID Paciente */
		WebElement numIDPac = driver.findElement(By.id("last_name"));
		//numIDPac.sendKeys(rs.getString("Id_Paciente"));
		numIDPac.sendKeys("1040555001");

		/* NumeroID Doctor */
		WebElement numIDDr = driver.findElement(By.id("telephone"));
		//numIDDr.sendKeys(rs.getString("Id_Doctor"));
		numIDDr.sendKeys("1040455323");

		/* Observaciones */
		WebElement observ = driver.findElement(By.id("identification_type"));
		//observ.sendKeys(rs.getString("Observaciones"));
		observ.sendKeys("Ninguna");

		/* Validación */
		WebElement validacionDoctor = driver.findElement(By.xpath("//div[contains(.,'Guardado')]"));
		Assert.assertTrue(validacionDoctor.getText().contains("Guardado"));
		//WebElement validacionDoctor = driver.findElement(By.xpath("//div[contains(.,'"+rs.getString("ResultadoEsperado")+"')]"));
		//Assert.assertTrue(validacionDoctor.getText().contains(""+rs.getString("ResultadoEsperado")+""));

		/* Cerrar Navegador */
		driver.close();
	}
}