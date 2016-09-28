package Controlador;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.testng.annotations.Test;
import Modelo.Help;
import Vista.AgendarCita;
import Vista.CreacionUsuarios;
import Vista.Ejecucion_IE_AfterClass;
import Vista.Ejecucion_IE_BeforeClass;

@Test
public class MAIN {

	public static void main() throws SQLException {

		/** CONEXI�N BD */
		/* Consulta de la informaci�n de la tabla Citas donde el campo Ejecutar sea = 1 */
		ResultSet rs = Help.Consulta("SELECT * FROM PSL.Citas WHERE Ejecutar = 1");
		rs.next();

		if (rs.getString("Navegador").equals("Explorer")) {

			/* Creaci�n Doctores y Pacientes */
			Ejecucion_IE_BeforeClass.setUp();
			CreacionUsuarios.usuarios();
			Ejecucion_IE_AfterClass.tearDown();

			/* Agendar Citas */
			AgendarCita.citas();

		} else if (rs.getString("Navegador").equals("Firefox")) {

			/* Creaci�n Doctores y Pacientes */
			CreacionUsuarios.usuarios();

			/* Agendar Citas */
			AgendarCita.citas();
		}
	}
}