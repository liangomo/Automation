package test_business;

import org.json.simple.JSONArray;
import test_data.DA_Usuario;

public class BL_Usuario {

	public JSONArray arrayUsers() {

		DA_Usuario user = new DA_Usuario();
		return user.arrayUsers();
	}

}