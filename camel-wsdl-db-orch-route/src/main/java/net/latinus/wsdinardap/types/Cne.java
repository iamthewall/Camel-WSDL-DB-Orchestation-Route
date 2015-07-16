
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
 *         &lt;element name="error" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="etiqueta" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="provincia" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="canton" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="parroquia" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="recinto" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cedula" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fecha" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sufrago" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="multa" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="partido" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tipo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="certificado" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "error",
    "etiqueta",
    "provincia",
    "canton",
    "parroquia",
    "recinto",
    "cedula",
    "nombre",
    "fecha",
    "sufrago",
    "multa",
    "partido",
    "tipo",
    "certificado"
})
@XmlRootElement(name = "cne")
public class Cne {

    protected int error;
    @XmlElement(required = true)
    protected String etiqueta;
    @XmlElement(required = true)
    protected String provincia;
    @XmlElement(required = true)
    protected String canton;
    @XmlElement(required = true)
    protected String parroquia;
    @XmlElement(required = true)
    protected String recinto;
    @XmlElement(required = true)
    protected String cedula;
    @XmlElement(required = true)
    protected String nombre;
    @XmlElement(required = true)
    protected String fecha;
    @XmlElement(required = true)
    protected String sufrago;
    protected double multa;
    @XmlElement(required = true)
    protected String partido;
    @XmlElement(required = true)
    protected String tipo;
    @XmlElement(required = true)
    protected String certificado;

    /**
     * Gets the value of the error property.
     * 
     */
    public int getError() {
        return error;
    }

    /**
     * Sets the value of the error property.
     * 
     */
    public void setError(int value) {
        this.error = value;
    }

    /**
     * Gets the value of the etiqueta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEtiqueta() {
        return etiqueta;
    }

    /**
     * Sets the value of the etiqueta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEtiqueta(String value) {
        this.etiqueta = value;
    }

    /**
     * Gets the value of the provincia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvincia() {
        return provincia;
    }

    /**
     * Sets the value of the provincia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvincia(String value) {
        this.provincia = value;
    }

    /**
     * Gets the value of the canton property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCanton() {
        return canton;
    }

    /**
     * Sets the value of the canton property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCanton(String value) {
        this.canton = value;
    }

    /**
     * Gets the value of the parroquia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParroquia() {
        return parroquia;
    }

    /**
     * Sets the value of the parroquia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParroquia(String value) {
        this.parroquia = value;
    }

    /**
     * Gets the value of the recinto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecinto() {
        return recinto;
    }

    /**
     * Sets the value of the recinto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecinto(String value) {
        this.recinto = value;
    }

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
     * Gets the value of the nombre property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Sets the value of the nombre property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

    /**
     * Gets the value of the fecha property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * Sets the value of the fecha property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFecha(String value) {
        this.fecha = value;
    }

    /**
     * Gets the value of the sufrago property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSufrago() {
        return sufrago;
    }

    /**
     * Sets the value of the sufrago property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSufrago(String value) {
        this.sufrago = value;
    }

    /**
     * Gets the value of the multa property.
     * 
     */
    public double getMulta() {
        return multa;
    }

    /**
     * Sets the value of the multa property.
     * 
     */
    public void setMulta(double value) {
        this.multa = value;
    }

    /**
     * Gets the value of the partido property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartido() {
        return partido;
    }

    /**
     * Sets the value of the partido property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartido(String value) {
        this.partido = value;
    }

    /**
     * Gets the value of the tipo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Sets the value of the tipo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipo(String value) {
        this.tipo = value;
    }

    /**
     * Gets the value of the certificado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertificado() {
        return certificado;
    }

    /**
     * Sets the value of the certificado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertificado(String value) {
        this.certificado = value;
    }

}
