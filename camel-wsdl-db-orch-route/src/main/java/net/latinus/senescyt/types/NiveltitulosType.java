
package net.latinus.senescyt.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for niveltitulos_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="niveltitulos_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nivel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="titulo" type="{http://latinus.net/senescyt/types}titulo_type" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "niveltitulos_type", propOrder = {
    "nivel",
    "titulo"
})
public class NiveltitulosType {

    @XmlElement(required = true, nillable = true)
    protected String nivel;
    @XmlElement(nillable = true)
    protected List<TituloType> titulo;

    /**
     * Gets the value of the nivel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNivel() {
        return nivel;
    }

    /**
     * Sets the value of the nivel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNivel(String value) {
        this.nivel = value;
    }

    /**
     * Gets the value of the titulo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the titulo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTitulo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TituloType }
     * 
     * 
     */
    public List<TituloType> getTitulo() {
        if (titulo == null) {
            titulo = new ArrayList<TituloType>();
        }
        return this.titulo;
    }

}
