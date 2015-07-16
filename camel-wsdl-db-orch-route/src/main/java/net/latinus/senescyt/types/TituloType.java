
package net.latinus.senescyt.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for titulo_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="titulo_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fechaGrado" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="fechaRegistro" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="ies" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nombreTitulo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="numeroRegistro" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tipo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tipoExtrajeroColegio" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="iesReconocimiento" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "titulo_type", propOrder = {
    "fechaGrado",
    "fechaRegistro",
    "ies",
    "nombreTitulo",
    "numeroRegistro",
    "tipo",
    "tipoExtrajeroColegio",
    "iesReconocimiento"
})
public class TituloType {

    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaGrado;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaRegistro;
    @XmlElement(required = true, nillable = true)
    protected String ies;
    @XmlElement(required = true, nillable = true)
    protected String nombreTitulo;
    @XmlElement(required = true, nillable = true)
    protected String numeroRegistro;
    @XmlElement(required = true, nillable = true)
    protected String tipo;
    @XmlElement(required = true, nillable = true)
    protected String tipoExtrajeroColegio;
    @XmlElement(required = true, nillable = true)
    protected String iesReconocimiento;

    /**
     * Gets the value of the fechaGrado property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaGrado() {
        return fechaGrado;
    }

    /**
     * Sets the value of the fechaGrado property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaGrado(XMLGregorianCalendar value) {
        this.fechaGrado = value;
    }

    /**
     * Gets the value of the fechaRegistro property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaRegistro() {
        return fechaRegistro;
    }

    /**
     * Sets the value of the fechaRegistro property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaRegistro(XMLGregorianCalendar value) {
        this.fechaRegistro = value;
    }

    /**
     * Gets the value of the ies property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIes() {
        return ies;
    }

    /**
     * Sets the value of the ies property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIes(String value) {
        this.ies = value;
    }

    /**
     * Gets the value of the nombreTitulo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreTitulo() {
        return nombreTitulo;
    }

    /**
     * Sets the value of the nombreTitulo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreTitulo(String value) {
        this.nombreTitulo = value;
    }

    /**
     * Gets the value of the numeroRegistro property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroRegistro() {
        return numeroRegistro;
    }

    /**
     * Sets the value of the numeroRegistro property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroRegistro(String value) {
        this.numeroRegistro = value;
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
     * Gets the value of the tipoExtrajeroColegio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoExtrajeroColegio() {
        return tipoExtrajeroColegio;
    }

    /**
     * Sets the value of the tipoExtrajeroColegio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoExtrajeroColegio(String value) {
        this.tipoExtrajeroColegio = value;
    }

    /**
     * Gets the value of the iesReconocimiento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIesReconocimiento() {
        return iesReconocimiento;
    }

    /**
     * Sets the value of the iesReconocimiento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIesReconocimiento(String value) {
        this.iesReconocimiento = value;
    }

}
