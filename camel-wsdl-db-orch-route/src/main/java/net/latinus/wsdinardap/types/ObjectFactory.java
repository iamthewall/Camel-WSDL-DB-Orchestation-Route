
package net.latinus.wsdinardap.types;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the net.latinus.wsdinardap.types package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: net.latinus.wsdinardap.types
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConsultaCedula }
     * 
     */
    public ConsultaCedula createConsultaCedula() {
        return new ConsultaCedula();
    }

    /**
     * Create an instance of {@link Cne }
     * 
     */
    public Cne createCne() {
        return new Cne();
    }

    /**
     * Create an instance of {@link ConsultaCedulaFault }
     * 
     */
    public ConsultaCedulaFault createConsultaCedulaFault() {
        return new ConsultaCedulaFault();
    }

    /**
     * Create an instance of {@link PutCedulaFault }
     * 
     */
    public PutCedulaFault createPutCedulaFault() {
        return new PutCedulaFault();
    }

    /**
     * Create an instance of {@link PutCne }
     * 
     */
    public PutCne createPutCne() {
        return new PutCne();
    }

}
