//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.08.09 at 01:52:56 PM BST 
//

package org.orcid.jaxb.model.record_v2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

import org.orcid.jaxb.model.common_v2.LastModifiedDate;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Java class for anonymous complex type.
 * 
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = { "lastModifiedDate", "education" })
@XmlRootElement(name = "Educations")
@Schema(description = "EducationsV2_0")
public class Educations implements Serializable, ActivitiesContainer {

    private static final long serialVersionUID = 1L;
   
    @XmlElement(namespace = "http://www.orcid.org/ns/common", name = "last-modified-date")
    protected LastModifiedDate lastModifiedDate;
    
    protected List<Education> education;

    /**
     * Gets the value of the affiliation property.
     * 
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the affiliation property.
     * 
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getAffiliation().add(newItem);
     * </pre>
     * 
     * Objects of the following type(s) are allowed in the list {@link Education
     * }
     * 
     * @return a List of Education objects
     * 
     */
    public List<Education> getEducation() {
        if (education == null) {
            education = new ArrayList<Education>();
        }
        return this.education;
    }

    @Override
    public Map<Long, Education> retrieveActivitiesAsMap() {
        Map<Long, Education> affMap = new HashMap<>();
        if (education != null) {
            for (Education aff : education) {
                if (aff.putCode != null) {
                    affMap.put(aff.putCode, aff);
                }
            }
        }
        return affMap;
    }

    @Override
    public List<? extends Activity> retrieveActivities() {
        return getEducation();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Educations)) {
            return false;
        }

        Educations that = (Educations) o;

        if (education != null ? !education.equals(that.education) : that.education != null) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        return education != null ? education.hashCode() : 0;
    }

    @Override
    public void setLastModifiedDate(LastModifiedDate lastModifiedDate) {
        // TODO Auto-generated method stub
    }
}
