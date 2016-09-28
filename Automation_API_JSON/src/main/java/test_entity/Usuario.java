package test_entity;

import java.io.IOException;
import java.io.Writer;
import java.util.LinkedHashMap;

import org.json.simple.JSONStreamAware;
import org.json.simple.JSONValue;

public class Usuario implements JSONStreamAware {

	private int  codigo;
	private String nombre;
	private String apellido;
	
	
	public Usuario(int codigo, String nombre, String apellido) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.apellido = apellido;
	}


	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	/* Formato a la cadena JSON */
	public void writeJSONString(Writer out) throws IOException {
		LinkedHashMap<String, String> obj = new LinkedHashMap<String, String>();
		obj.put("codigo", String.valueOf(codigo));
		obj.put("nombre", nombre);
		obj.put("apellido", apellido);
		JSONValue.writeJSONString(obj, out); // Llamado a clase JSON
	}
}