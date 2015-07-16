
package ec.gob.dinardap.registrocivilservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cedula" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element ref="{http://www.dinardap.gob.ec/RegistroCivilService/}cedulados"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "cedula",
    "cedulados"
})
@XmlRootElement(name = "put_cedulados")
public class PutCedulados {

    @XmlElement(required = true)
    protected String cedula;
    @XmlElement(namespace = "http://www.dinardap.gob.ec/RegistroCivilService/", required = true)
    protected Cedulados cedulados;

    /**
     * Gets the value of the cedula property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCedula() {
        return cedula;
    }

    /**
     * Sets the value of the cedula property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCedula(String value) {
        this.cedula = value;
    }

    /**
     * Gets the value of the cedulados property.
     * 
     * @return
     *     possible object is
     *     {@link Cedulados }
     *     
     */
    public Cedulados getCedulados() {
        return cedulados;
    }

    /**
     * Sets the value of the cedulados property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cedulados }
     *     
     */
    public void setCedulados(Cedulados value) {
        this.cedulados = value;
    }

}
