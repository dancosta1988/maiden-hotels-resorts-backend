//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.09.30 at 10:09:53 AM BST 
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
 *         &lt;element ref="{http://www.tibco.com/schemas/TIBCO/Maiden_Hotels_Project/Schemas/Bookings.xsd}SuccessBooking" minOccurs="0"/&gt;
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
    "successBooking"
})
@XmlRootElement(name = "StatusBooking")
public class StatusBooking {

    @XmlElement(name = "SuccessBooking")
    protected SuccessBooking successBooking;

    /**
     * Gets the value of the successBooking property.
     * 
     * @return
     *     possible object is
     *     {@link SuccessBooking }
     *     
     */
    public SuccessBooking getSuccessBooking() {
        return successBooking;
    }

    /**
     * Sets the value of the successBooking property.
     * 
     * @param value
     *     allowed object is
     *     {@link SuccessBooking }
     *     
     */
    public void setSuccessBooking(SuccessBooking value) {
        this.successBooking = value;
    }

}
