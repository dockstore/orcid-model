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
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * Java class for anonymous complex type.
 * 
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.orcid.org/ns/orcid}affiliation-city"/&gt;
 *         &lt;element ref="{http://www.orcid.org/ns/orcid}affiliation-region" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.orcid.org/ns/orcid}affiliation-country"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType( propOrder = { "affiliationCity", "affiliationRegion", "affiliationCountry" })
@XmlRootElement(name = "address")
public class AffiliationAddress implements Serializable {

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "city", required = true)
    protected AffiliationCity affiliationCity;
    @XmlElement(name = "region")
    protected AffiliationRegion affiliationRegion;
    @XmlElement(name = "country", required = true)
    protected AffiliationCountry affiliationCountry;

    /**
     * Gets the value of the affiliationCity property.
     * 
     * @return possible object is {@link AffiliationCity }
     * 
     */
    public AffiliationCity getAffiliationCity() {
        return affiliationCity;
    }

    /**
     * Sets the value of the affiliationCity property.
     * 
     * @param value
     *            allowed object is {@link AffiliationCity }
     * 
     */
    public void setAffiliationCity(AffiliationCity value) {
        this.affiliationCity = value;
    }

    /**
     * Gets the value of the affiliationRegion property.
     * 
     * @return possible object is {@link AffiliationRegion }
     * 
     */
    public AffiliationRegion getAffiliationRegion() {
        return affiliationRegion;
    }

    /**
     * Sets the value of the affiliationRegion property.
     * 
     * @param value
     *            allowed object is {@link AffiliationRegion }
     * 
     */
    public void setAffiliationRegion(AffiliationRegion value) {
        this.affiliationRegion = value;
    }

    /**
     * Gets the value of the affiliationCountry property.
     * 
     * @return possible object is {@link Country }
     * 
     */
    public AffiliationCountry getAffiliationCountry() {
        return affiliationCountry;
    }

    /**
     * Sets the value of the affiliationCountry property.
     * 
     * @param value
     *            allowed object is {@link AffiliationCountry }
     * 
     */
    public void setAffiliationCountry(AffiliationCountry value) {
        this.affiliationCountry = value;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((affiliationCity == null) ? 0 : affiliationCity.hashCode());
        result = prime * result + ((affiliationCountry == null) ? 0 : affiliationCountry.hashCode());
        result = prime * result + ((affiliationRegion == null) ? 0 : affiliationRegion.hashCode());
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
        AffiliationAddress other = (AffiliationAddress) obj;
        if (affiliationCity == null) {
            if (other.affiliationCity != null)
                return false;
        } else if (!affiliationCity.equals(other.affiliationCity))
            return false;
        if (affiliationCountry == null) {
            if (other.affiliationCountry != null)
                return false;
        } else if (!affiliationCountry.equals(other.affiliationCountry))
            return false;
        if (affiliationRegion == null) {
            if (other.affiliationRegion != null)
                return false;
        } else if (!affiliationRegion.equals(other.affiliationRegion))
            return false;
        return true;
    }

}
