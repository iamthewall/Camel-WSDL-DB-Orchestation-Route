
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
 *         &lt;element name="ceduladosFault" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "ceduladosFault"
})
@XmlRootElement(name = "ceduladosFault")
public class CeduladosFault {

    @XmlElement(required = true)
    protected String ceduladosFault;

    /**
     * Gets the value of the ceduladosFault property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCeduladosFault() {
        return ceduladosFault;
    }

    /**
     * Sets the value of the ceduladosFault property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCeduladosFault(String value) {
        this.ceduladosFault = value;
    }

}
