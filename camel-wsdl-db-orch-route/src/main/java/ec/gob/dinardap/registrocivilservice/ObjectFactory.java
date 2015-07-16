
package ec.gob.dinardap.registrocivilservice;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ec.gob.dinardap.registrocivilservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ec.gob.dinardap.registrocivilservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PutCedulados }
     * 
     */
    public PutCedulados createPutCedulados() {
        return new PutCedulados();
    }

    /**
     * Create an instance of {@link Cedulados }
     * 
     */
    public Cedulados createCedulados() {
        return new Cedulados();
    }

    /**
     * Create an instance of {@link CeduladosFault }
     * 
     */
    public CeduladosFault createCeduladosFault() {
        return new CeduladosFault();
    }

    /**
     * Create an instance of {@link PutCeduladosFault }
     * 
     */
    public PutCeduladosFault createPutCeduladosFault() {
        return new PutCeduladosFault();
    }

    /**
     * Create an instance of {@link Cedula }
     * 
     */
    public Cedula createCedula() {
        return new Cedula();
    }

}
