
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
 *         &lt;element ref="{http://latinus.net/wsDinardap/types}consulta_cedula"/>
 *         &lt;element ref="{http://latinus.net/wsDinardap/types}cne"/>
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
    "consultaCedula",
    "cne"
})
@XmlRootElement(name = "put_cne")
public class PutCne {

    @XmlElement(name = "consulta_cedula", namespace = "http://latinus.net/wsDinardap/types", required = true)
    protected ConsultaCedula consultaCedula;
    @XmlElement(namespace = "http://latinus.net/wsDinardap/types", required = true)
    protected Cne cne;

    /**
     * Gets the value of the consultaCedula property.
     * 
     * @return
     *     possible object is
     *     {@link ConsultaCedula }
     *     
     */
    public ConsultaCedula getConsultaCedula() {
        return consultaCedula;
    }

    /**
     * Sets the value of the consultaCedula property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsultaCedula }
     *     
     */
    public void setConsultaCedula(ConsultaCedula value) {
        this.consultaCedula = value;
    }

    /**
     * Gets the value of the cne property.
     * 
     * @return
     *     possible object is
     *     {@link Cne }
     *     
     */
    public Cne getCne() {
        return cne;
    }

    /**
     * Sets the value of the cne property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cne }
     *     
     */
    public void setCne(Cne value) {
        this.cne = value;
    }

}
