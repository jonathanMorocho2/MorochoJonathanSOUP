package ups.edu.ec.Service;

import java.util.List;

import javax.inject.Inject;

import ups.edu.ec.Model.Libro;
import ups.edu.ec.on.LibroOnLocal;
import javax.jws.WebMethod;


public class Libroservice {	
	@Inject
	private LibroOnLocal libroON;

	@WebMethod
	public String CrearLibro(Libro libro) {
		try {
			libroON.insertarLibro(libro);
			return "Libro Añadido Correctamente";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "ERROR";
		}
	}
	

	@WebMethod
	public List<Libro> getLibros() {
		try {
			return libroON.getLibros();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}

	}


}




