
package ups.edu.ec.EvaMorochoJonathanSrv;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


	/**
	 * <p>Clase Java para CrearLibro complex type.
	 * 
	 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
	 * 
	 * <pre>
	 * &lt;complexType name="CrearLibro">
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="arg0" type="{http://services.EvaMorochoJonathanSrv.ec.edu.ups/}libro" minOccurs="0"/>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "CrearLibro", propOrder = {
	    "arg0"
	})
	public class CrearLibro {

	    protected Libro arg0;

	    /**
	     *
	     * 
	     * @return
	     *     possible object is
	     *     {@link Libro }
	     *     
	     */
	    public Libro getArg0() {
	        return arg0;
	    }

	    /**
	     * Define el valor de la propiedad arg0.
	     * 
	     * @param value
	     *     allowed object is
	     *     {@link Libro }
	     *     
	     */
	    public void setArg0(Libro value) {
	        this.arg0 = value;
	    }

	}


