
package net.latinus.senescyt.types;

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
 *         &lt;element ref="{http://latinus.net/senescyt/types}titulos"/>
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
    "titulos"
})
@XmlRootElement(name = "put_titulos")
public class PutTitulos {

    @XmlElement(required = true)
    protected String cedula;
    @XmlElement(namespace = "http://latinus.net/senescyt/types", required = true)
    protected Titulos titulos;

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
     * Gets the value of the titulos property.
     * 
     * @return
     *     possible object is
     *     {@link Titulos }
     *     
     */
    public Titulos getTitulos() {
        return titulos;
    }

    /**
     * Sets the value of the titulos property.
     * 
     * @param value
     *     allowed object is
     *     {@link Titulos }
     *     
     */
    public void setTitulos(Titulos value) {
        this.titulos = value;
    }

}
