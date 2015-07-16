
package net.latinus.senescyt.types;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the net.latinus.senescyt.types package. 
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

    private final static QName _Cedula_QNAME = new QName("http://latinus.net/senescyt/types", "cedula");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: net.latinus.senescyt.types
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PutTitulos }
     * 
     */
    public PutTitulos createPutTitulos() {
        return new PutTitulos();
    }

    /**
     * Create an instance of {@link Titulos }
     * 
     */
    public Titulos createTitulos() {
        return new Titulos();
    }

    /**
     * Create an instance of {@link NiveltitulosType }
     * 
     */
    public NiveltitulosType createNiveltitulosType() {
        return new NiveltitulosType();
    }

    /**
     * Create an instance of {@link SenescytFault }
     * 
     */
    public SenescytFault createSenescytFault() {
        return new SenescytFault();
    }

    /**
     * Create an instance of {@link TituloType }
     * 
     */
    public TituloType createTituloType() {
        return new TituloType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://latinus.net/senescyt/types", name = "cedula")
    public JAXBElement<String> createCedula(String value) {
        return new JAXBElement<String>(_Cedula_QNAME, String.class, null, value);
    }

}
