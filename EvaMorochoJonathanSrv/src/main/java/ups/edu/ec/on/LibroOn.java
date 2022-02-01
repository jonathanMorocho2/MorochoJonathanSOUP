package ups.edu.ec.on;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;


import ups.edu.ec.Model.Libro;
import ups.edu.ec.dao.LibroDao;

@Stateless
public class LibroOn implements LibroOnLocal {

	@Inject
	private LibroDao lidao;

	public void insertarLibro(Libro libro) throws Exception {
		
		lidao.insert(libro);
	}

	public List<Libro> getLibros() throws Exception {
		return lidao.getList();

	}

	public Libro buscarLibro(int codigo) throws Exception {
		return lidao.read(codigo);
	}

	public Libro getLibro(int codigo) throws Exception {
		return lidao.read(codigo);
	}

	public void guardar(Libro p) throws Exception {
		if (lidao.read(p.getCodigo()) == null)
			lidao.insert(p);
		else
			lidao.update(p);
	}

	

}
