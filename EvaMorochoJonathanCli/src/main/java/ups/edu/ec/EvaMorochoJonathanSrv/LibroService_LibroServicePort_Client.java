package ups.edu.ec.EvaMorochoJonathanSrv;


/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
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
public final class LibroService_LibroServicePort_Client {

    private static final QName SERVICE_NAME = new QName("http://services.EvaMorochoJonathanSrv.ec.edu.ups/", "LibroServiceService");

    private LibroService_LibroServicePort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = LibroServiceService.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        LibroServiceService ss = new LibroServiceService(wsdlURL, SERVICE_NAME);
        LibroService port = ss.getLibroServicePort();  
        
        {
        System.out.println("Invoking crearLibro...");
        ups.edu.ec.EvaMorochoJonathanSrv.services.Libro _crearLibro_arg0 = null;
        java.lang.String _crearLibro__return = port.crearLibro(_crearLibro_arg0);
        System.out.println("crearLibro.result=" + _crearLibro__return);


        }
        {
        System.out.println("Invoking getLibros...");
        java.util.List<ups.edu.ec.EvaMorochoJonathanSrv.services.Libro> _getLibros__return = port.getLibros();
        System.out.println("getLibros.result=" + _getLibros__return);


        }

        System.exit(0);
    }

}
