package ups.edu.ec.on;

import java.util.List;

import javax.ejb.Local;

import ups.edu.ec.Model.Libro;

@Local
public interface LibroOnLocal {

	
	public void insertarLibro(Libro libro) throws Exception;
	public List<Libro> getLibros() throws Exception;
	public Libro buscarLibro(int codigo) throws Exception;
	public Libro getLibro(int codigo) throws Exception;
	public void guardar(Libro p) throws Exception;
		
}


