package Controlador;

import java.sql.SQLException;

import org.testng.annotations.Test;

import Vista.AgendarCita;
import Vista.CreacionUsuarios;
import Vista.Ejecucion_IE_AfterClass;
import Vista.Ejecucion_IE_BeforeClass;

@Test
public class MAIN {

	public static void main() throws SQLException {

		// Creación Doctores y Pacientes
		Ejecucion_IE_BeforeClass.setUp();
		CreacionUsuarios.usuarios();
		Ejecucion_IE_AfterClass.tearDown();
		
		// Agendar Citas
		AgendarCita.citas();
		
	}
}