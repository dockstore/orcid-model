//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.08.09 at 01:52:56 PM BST 
//

package org.orcid.jaxb.model.common_v2;

import java.io.Serializable;

import jakarta.xml.bind.annotation.XmlRootElement;

import io.swagger.v3.oas.annotations.media.Schema;

@XmlRootElement(name = "contributor-orcid")
@Schema(description = "ContributorOrcidV2_0")
public class ContributorOrcid extends OrcidIdBase implements Serializable {
    private static final long serialVersionUID = 525166769240880033L;

    public ContributorOrcid() {
        super();
    }

    public ContributorOrcid(String path) {
        super(path);
    }

    public ContributorOrcid(OrcidIdBase other) {
        super(other);
    }

}
