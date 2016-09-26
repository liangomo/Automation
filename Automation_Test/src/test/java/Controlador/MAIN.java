package Controlador;

import java.sql.SQLException;
import org.testng.annotations.Test;
import Vista.CreacionUsuarios;

public class MAIN {

	@Test
	public static void main() throws SQLException {

		// Creación Doctores y Pacientes
		CreacionUsuarios.usuarios();
		
	}
}