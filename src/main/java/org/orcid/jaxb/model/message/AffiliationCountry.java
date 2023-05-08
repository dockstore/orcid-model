//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.08.19 at 01:44:12 PM BST 
//

package org.orcid.jaxb.model.message;

import java.io.Serializable;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;

/**
 * ISO 3611 country
 * 
 * Java class for anonymous complex type.
 * 
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.orcid.org/ns/orcid&gt;iso-3166-country"&gt;
 *       &lt;attGroup ref="{http://www.orcid.org/ns/orcid}visibility"/&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType( propOrder = { "value" })
@XmlRootElement(name = "affiliation-country")
public class AffiliationCountry implements Serializable {

    private final static long serialVersionUID = 1L;
    @XmlValue
    protected Iso3166Country value;

    public AffiliationCountry() {
        super();
    }

    public AffiliationCountry(Iso3166Country value) {
        super();
        this.value = value;
    }

    /**
     * ISO 3166 country codes
     * 
     * @return possible object is {@link Iso3166Country }
     * 
     */
    public Iso3166Country getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *            allowed object is {@link Iso3166Country }
     * 
     */
    public void setValue(Iso3166Country value) {
        this.value = value;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((value == null) ? 0 : value.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        AffiliationCountry other = (AffiliationCountry) obj;
        if (value != other.value)
            return false;
        return true;
    }

}
