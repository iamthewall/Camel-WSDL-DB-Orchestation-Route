
package net.latinus.wsdinardap.types;

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
 *         &lt;element name="i_cedula" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="i_usuario" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="i_clave" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "iCedula",
    "iUsuario",
    "iClave"
})
@XmlRootElement(name = "consulta_cedula")
public class ConsultaCedula {

    @XmlElement(name = "i_cedula", required = true)
    protected String iCedula;
    @XmlElement(name = "i_usuario", required = true)
    protected String iUsuario;
    @XmlElement(name = "i_clave", required = true)
    protected String iClave;

    /**
     * Gets the value of the iCedula property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getICedula() {
        return iCedula;
    }

    /**
     * Sets the value of the iCedula property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setICedula(String value) {
        this.iCedula = value;
    }

    /**
     * Gets the value of the iUsuario property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIUsuario() {
        return iUsuario;
    }

    /**
     * Sets the value of the iUsuario property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIUsuario(String value) {
        this.iUsuario = value;
    }

    /**
     * Gets the value of the iClave property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIClave() {
        return iClave;
    }

    /**
     * Sets the value of the iClave property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIClave(String value) {
        this.iClave = value;
    }

}
