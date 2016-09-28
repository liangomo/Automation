package test_data;

import org.json.simple.JSONArray;

import test_entity.Usuario;

public class DA_Usuario {

	@SuppressWarnings("unchecked")
	public JSONArray arrayUsers() {
		
		JSONArray arr = new JSONArray();
		arr.add(new Usuario(1325, "Laura", "Sarmiento"));
		arr.add(new Usuario(1326, "Nicolas", "Suarez"));
		arr.add(new Usuario(1327, "Paula", "Duarte"));
		return arr;
		
	}
}