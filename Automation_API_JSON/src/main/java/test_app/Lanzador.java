package test_app;

import java.io.IOException;
import java.io.StringWriter;
import org.json.simple.JSONArray;
import test_business.BL_Usuario;

public class Lanzador {

	public static void main(String[] args) {
		
		/* Variables y array que almacena arreglo de usuarios */
		BL_Usuario bl_Usuario = new BL_Usuario();
		JSONArray array = new JSONArray(); 
		array = bl_Usuario.arrayUsers(); 
		
		/* Llamdo al método del array - Escribe a una cadena JSON lo que esté en la variable out */
		StringWriter out = new StringWriter();
		try {
			array.writeJSONString(out);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		/* Para mostrar en consola */
		System.out.println(out);



	}

}
