package test;

import java.util.List;

import modelo.Cuenta;
import servicio.DAO;
import servicio.DAOGenerica;

public class TestJPA {
	
	public static void main(String[] args) {
		DAO dao = new DAOGenerica();
		List<Cuenta> lista  = dao.getListNameQuery(Cuenta.class,"Cuenta.findAll");
		for (Cuenta c : lista) {
			System.out.println(c.toString());
		}
		Cuenta cuenta = new Cuenta(4,"Norman","Cash");
		dao.createEntity(cuenta);
	}

}
