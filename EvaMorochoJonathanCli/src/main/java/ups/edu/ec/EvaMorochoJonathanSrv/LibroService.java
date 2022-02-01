package ups.edu.ec.EvaMorochoJonathanSrv;


import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.11
 * 2022-02-01T12:45:04.057-08:00
 * Generated source version: 2.7.11
 * 
 */
@WebService(targetNamespace = "http://services.EvaMorochoJonathanSrv.ec.edu.ups/", name = "LibroService")
@XmlSeeAlso({ObjectFactory.class})
public interface LibroService {

    @WebMethod(operationName = "CrearLibro")
    @RequestWrapper(localName = "CrearLibro", targetNamespace = "http://services.EvaMorochoJonathanSrv.ec.edu.ups/", className = "ups.edu.ec.EvaMorochoJonathanSrv.services.CrearLibro")
    @ResponseWrapper(localName = "CrearLibroResponse", targetNamespace = "http://services.EvaMorochoJonathanSrv.ec.edu.ups/", className = "ups.edu.ec.EvaMorochoJonathanSrv.services.CrearLibroResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.lang.String crearLibro(
        @WebParam(name = "arg0", targetNamespace = "")
        ups.edu.ec.evaastudillobrauliosrv.services.Libro arg0
    );

    @WebMethod
    @RequestWrapper(localName = "getLibros", targetNamespace = "http://services.EvaMorochoJonathanSrv.ec.edu.ups/", className = "ups.edu.ec.EvaMorochoJonathanSrv.services.GetLibros")
    @ResponseWrapper(localName = "getLibrosResponse", targetNamespace = "http://services.EvaMorochoJonathanSrv.ec.edu.ups/", className = "ups.edu.ec.EvaMorochoJonathanSrv.services.GetLibrosResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.util.List<ups.edu.ec.EvaMorochoJonathanSrv.services.Libro> getLibros();
}