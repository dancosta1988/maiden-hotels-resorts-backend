//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.10.07 at 12:28:08 PM BST 
//


package com.maidenhotels.Backend.tibco.schemas;

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
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.tibco.com/schemas/TIBCO/Maiden_Hotels_Project/Schemas/Guests.xsd}SuccessGuest" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "successGuest"
})
@XmlRootElement(name = "StatusGuest", namespace = "http://www.tibco.com/schemas/TIBCO/Maiden_Hotels_Project/Schemas/Guests.xsd")
public class StatusGuest {

    @XmlElement(name = "SuccessGuest", namespace = "http://www.tibco.com/schemas/TIBCO/Maiden_Hotels_Project/Schemas/Guests.xsd")
    protected SuccessGuest successGuest;

    public StatusGuest() {
    }

    public StatusGuest(SuccessGuest successGuest) {
        this.successGuest = successGuest;
    }

    /**
     * Gets the value of the successGuest property.
     * 
     * @return
     *     possible object is
     *     {@link SuccessGuest }
     *     
     */
    public SuccessGuest getSuccessGuest() {
        return successGuest;
    }

    /**
     * Sets the value of the successGuest property.
     * 
     * @param value
     *     allowed object is
     *     {@link SuccessGuest }
     *     
     */
    public void setSuccessGuest(SuccessGuest value) {
        this.successGuest = value;
    }

}
