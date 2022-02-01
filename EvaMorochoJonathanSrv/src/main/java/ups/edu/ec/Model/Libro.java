package ups.edu.ec.Model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Tbl_libro")
public class Libro implements Serializable {
	
	/**
	 * 
	 */

		private static final long serialVersionUID = 1L;
		
		@Id
		@Column(name = "lib_codigo")
		private int codigo;
		
		@Column(name = "lib_titulo")
		private String titulo;
		
		@Column(name = "lib_editorial")
		private String editorial;
		
		@Column(name = "lib_idioma")
		private String idioma;

		public int getCodigo() {
			return codigo;
		}

		public void setCodigo(int codigo) {
			this.codigo = codigo;
		}

		public String getTitulo() {
			return titulo;
		}

		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}

		public String getEditorial() {
			return editorial;
		}

		public void setEditorial(String editorial) {
			this.editorial = editorial;
		}

		public String getIdioma() {
			return idioma;
		}

		public void setIdioma(String idioma) {
			this.idioma = idioma;
		}

		public static long getSerialversionuid() {
			return serialVersionUID;
		}
		
		
		
		
		
}
