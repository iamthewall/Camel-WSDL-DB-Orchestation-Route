
package ec.gob.dinardap.registrocivilservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="genero" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="condicionCiudadano" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fechaNacimiento" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="lugarNacimiento" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nacionalidad" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="estadoCivil" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="individualDactilar" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="conyuge" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nombrePadre" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nacionalidadPadre" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nombreMadre" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nacionalidadMadre" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="domicilio" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="callesDomicilio" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="numeroCasa" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fechaMatrimonio" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="lugarMatrimonio" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fechaDefuncion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="observaciones" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fechaInscripcionDefuncion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fechaCache" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
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
    "nombre",
    "genero",
    "condicionCiudadano",
    "fechaNacimiento",
    "lugarNacimiento",
    "nacionalidad",
    "estadoCivil",
    "individualDactilar",
    "conyuge",
    "nombrePadre",
    "nacionalidadPadre",
    "nombreMadre",
    "nacionalidadMadre",
    "domicilio",
    "callesDomicilio",
    "numeroCasa",
    "fechaMatrimonio",
    "lugarMatrimonio",
    "fechaDefuncion",
    "observaciones",
    "fechaInscripcionDefuncion",
    "fechaCache"
})
@XmlRootElement(name = "cedulados")
public class Cedulados {

    @XmlElement(required = true)
    protected String cedula;
    @XmlElement(required = true)
    protected String nombre;
    @XmlElement(required = true)
    protected String genero;
    @XmlElement(required = true)
    protected String condicionCiudadano;
    @XmlElement(required = true)
    protected String fechaNacimiento;
    @XmlElement(required = true)
    protected String lugarNacimiento;
    @XmlElement(required = true)
    protected String nacionalidad;
    @XmlElement(required = true)
    protected String estadoCivil;
    @XmlElement(required = true)
    protected String individualDactilar;
    @XmlElement(required = true)
    protected String conyuge;
    @XmlElement(required = true)
    protected String nombrePadre;
    @XmlElement(required = true)
    protected String nacionalidadPadre;
    @XmlElement(required = true)
    protected String nombreMadre;
    @XmlElement(required = true)
    protected String nacionalidadMadre;
    @XmlElement(required = true)
    protected String domicilio;
    @XmlElement(required = true)
    protected String callesDomicilio;
    @XmlElement(required = true)
    protected String numeroCasa;
    @XmlElement(required = true)
    protected String fechaMatrimonio;
    @XmlElement(required = true)
    protected String lugarMatrimonio;
    @XmlElement(required = true)
    protected String fechaDefuncion;
    @XmlElement(required = true)
    protected String observaciones;
    @XmlElement(required = true)
    protected String fechaInscripcionDefuncion;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaCache;

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
     * Gets the value of the genero property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenero() {
        return genero;
    }

    /**
     * Sets the value of the genero property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenero(String value) {
        this.genero = value;
    }

    /**
     * Gets the value of the condicionCiudadano property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCondicionCiudadano() {
        return condicionCiudadano;
    }

    /**
     * Sets the value of the condicionCiudadano property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCondicionCiudadano(String value) {
        this.condicionCiudadano = value;
    }

    /**
     * Gets the value of the fechaNacimiento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * Sets the value of the fechaNacimiento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaNacimiento(String value) {
        this.fechaNacimiento = value;
    }

    /**
     * Gets the value of the lugarNacimiento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLugarNacimiento() {
        return lugarNacimiento;
    }

    /**
     * Sets the value of the lugarNacimiento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLugarNacimiento(String value) {
        this.lugarNacimiento = value;
    }

    /**
     * Gets the value of the nacionalidad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNacionalidad() {
        return nacionalidad;
    }

    /**
     * Sets the value of the nacionalidad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNacionalidad(String value) {
        this.nacionalidad = value;
    }

    /**
     * Gets the value of the estadoCivil property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstadoCivil() {
        return estadoCivil;
    }

    /**
     * Sets the value of the estadoCivil property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstadoCivil(String value) {
        this.estadoCivil = value;
    }

    /**
     * Gets the value of the individualDactilar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndividualDactilar() {
        return individualDactilar;
    }

    /**
     * Sets the value of the individualDactilar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndividualDactilar(String value) {
        this.individualDactilar = value;
    }

    /**
     * Gets the value of the conyuge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConyuge() {
        return conyuge;
    }

    /**
     * Sets the value of the conyuge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConyuge(String value) {
        this.conyuge = value;
    }

    /**
     * Gets the value of the nombrePadre property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombrePadre() {
        return nombrePadre;
    }

    /**
     * Sets the value of the nombrePadre property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombrePadre(String value) {
        this.nombrePadre = value;
    }

    /**
     * Gets the value of the nacionalidadPadre property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNacionalidadPadre() {
        return nacionalidadPadre;
    }

    /**
     * Sets the value of the nacionalidadPadre property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNacionalidadPadre(String value) {
        this.nacionalidadPadre = value;
    }

    /**
     * Gets the value of the nombreMadre property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreMadre() {
        return nombreMadre;
    }

    /**
     * Sets the value of the nombreMadre property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreMadre(String value) {
        this.nombreMadre = value;
    }

    /**
     * Gets the value of the nacionalidadMadre property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNacionalidadMadre() {
        return nacionalidadMadre;
    }

    /**
     * Sets the value of the nacionalidadMadre property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNacionalidadMadre(String value) {
        this.nacionalidadMadre = value;
    }

    /**
     * Gets the value of the domicilio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomicilio() {
        return domicilio;
    }

    /**
     * Sets the value of the domicilio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomicilio(String value) {
        this.domicilio = value;
    }

    /**
     * Gets the value of the callesDomicilio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallesDomicilio() {
        return callesDomicilio;
    }

    /**
     * Sets the value of the callesDomicilio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallesDomicilio(String value) {
        this.callesDomicilio = value;
    }

    /**
     * Gets the value of the numeroCasa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroCasa() {
        return numeroCasa;
    }

    /**
     * Sets the value of the numeroCasa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroCasa(String value) {
        this.numeroCasa = value;
    }

    /**
     * Gets the value of the fechaMatrimonio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaMatrimonio() {
        return fechaMatrimonio;
    }

    /**
     * Sets the value of the fechaMatrimonio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaMatrimonio(String value) {
        this.fechaMatrimonio = value;
    }

    /**
     * Gets the value of the lugarMatrimonio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLugarMatrimonio() {
        return lugarMatrimonio;
    }

    /**
     * Sets the value of the lugarMatrimonio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLugarMatrimonio(String value) {
        this.lugarMatrimonio = value;
    }

    /**
     * Gets the value of the fechaDefuncion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaDefuncion() {
        return fechaDefuncion;
    }

    /**
     * Sets the value of the fechaDefuncion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaDefuncion(String value) {
        this.fechaDefuncion = value;
    }

    /**
     * Gets the value of the observaciones property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservaciones() {
        return observaciones;
    }

    /**
     * Sets the value of the observaciones property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservaciones(String value) {
        this.observaciones = value;
    }

    /**
     * Gets the value of the fechaInscripcionDefuncion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaInscripcionDefuncion() {
        return fechaInscripcionDefuncion;
    }

    /**
     * Sets the value of the fechaInscripcionDefuncion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaInscripcionDefuncion(String value) {
        this.fechaInscripcionDefuncion = value;
    }

    /**
     * Gets the value of the fechaCache property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaCache() {
        return fechaCache;
    }

    /**
     * Sets the value of the fechaCache property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaCache(XMLGregorianCalendar value) {
        this.fechaCache = value;
    }

}
