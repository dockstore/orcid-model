//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.10.04 at 01:24:28 PM BST 
//

package org.orcid.jaxb.model.message;

import java.io.Serializable;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * Element to contain a citation of a given type
 * 
 * Java class for citation complex type.
 * 
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="citation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="work-citation-type" type="{http://www.orcid.org/ns/orcid}citation-type"/&gt;
 *         &lt;element name="citation" type="{http://www.orcid.org/ns/orcid}citation"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "citation", propOrder = { "workCitationType", "citation" })
public class Citation implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    @XmlElement(name = "work-citation-type", required = true, defaultValue = "formatted-unspecified")
    protected CitationType workCitationType = CitationType.FORMATTED_UNSPECIFIED;
    @XmlElement(name = "citation", required = true)
    protected String citation;

    public Citation() {
    }

    public Citation(String citation, CitationType citationType) {
        this.citation = citation;
        this.workCitationType = citationType;
    }

    public Citation(String citation) {
        this(citation, CitationType.FORMATTED_UNSPECIFIED);
    }

    /**
     * Gets the value of the workCitationType property.
     *
     * @return possible object is
     *         {@link CitationType }
     */
    public CitationType getWorkCitationType() {
        return workCitationType;
    }

    /**
     * Sets the value of the workCitationType property.
     *
     * @param value
     *         allowed object is
     *         {@link CitationType }
     */
    public void setWorkCitationType(CitationType value) {
        this.workCitationType = value;
    }

    /**
     * Gets the value of the citation property.
     *
     * @return possible object is
     *         {@link Citation }
     */
    public String getCitation() {
        return citation;
    }

    /**
     * Sets the value of the citation property.
     *
     * @param value
     *         allowed object is
     *         {@link Citation }
     */
    public void setCitation(String value) {
        this.citation = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Citation)) {
            return false;
        }

        Citation citation1 = (Citation) o;

        if (citation != null ? !citation.equals(citation1.citation) : citation1.citation != null) {
            return false;
        }
        if (workCitationType != citation1.workCitationType) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = workCitationType != null ? workCitationType.hashCode() : 0;
        result = 31 * result + (citation != null ? citation.hashCode() : 0);
        return result;
    }
}
