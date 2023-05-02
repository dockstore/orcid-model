//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.08.02 at 04:23:52 PM BST 
//

package org.orcid.jaxb.model.v3.release.record;

import java.io.Serializable;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
* 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType( propOrder = { "contributorRole" })
@XmlRootElement(name = "contributorAttributes", namespace = "http://www.orcid.org/ns/funding")
@Schema(description = "FundingContributorAttributesV3_0")
public class FundingContributorAttributes implements Serializable {
    private static final long serialVersionUID = 8970123534713615455L;

    @XmlElement(required = true, namespace = "http://www.orcid.org/ns/funding", name = "contributor-role")
    @Schema(type = "string", allowableValues = "author, assignee, editor, chair-or-translator, co-investigator, co-inventor," +
            "graduate-student, other-inventor, principal-investigator, postdoctoral-researcher, support-staff")
    protected String contributorRole;    

    /**
     * Gets the value of the contributorRole property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContributorRole() {
        return contributorRole;
    }

    /**
     * Sets the value of the contributorRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContributorRole(String value) {
        this.contributorRole = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FundingContributorAttributes)) {
            return false;
        }

        FundingContributorAttributes that = (FundingContributorAttributes) o;

        if (contributorRole != that.contributorRole) {
            return false;
        }        

        return true;
    }

    @Override
    public int hashCode() {
        int result = 31 * (contributorRole != null ? contributorRole.hashCode() : 0);
        return result;
    }
}
