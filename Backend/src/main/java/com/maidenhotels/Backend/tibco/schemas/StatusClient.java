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
 *         &lt;element ref="{http://www.tibco.com/schemas/TIBCO/Maiden_Hotels_Project/Schemas/Clients.xsd}SuccessClient" minOccurs="0"/&gt;
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
    "successClient"
})
@XmlRootElement(name = "StatusClient", namespace = "http://www.tibco.com/schemas/TIBCO/Maiden_Hotels_Project/Schemas/Clients.xsd")
public class StatusClient {

    @XmlElement(name = "SuccessClient", namespace = "http://www.tibco.com/schemas/TIBCO/Maiden_Hotels_Project/Schemas/Clients.xsd")
    protected SuccessClient successClient;

    public StatusClient() {
    }

    public StatusClient(SuccessClient successClient) {
        this.successClient = successClient;
    }

    /**
     * Gets the value of the successClient property.
     * 
     * @return
     *     possible object is
     *     {@link SuccessClient }
     *     
     */
    public SuccessClient getSuccessClient() {
        return successClient;
    }

    /**
     * Sets the value of the successClient property.
     * 
     * @param value
     *     allowed object is
     *     {@link SuccessClient }
     *     
     */
    public void setSuccessClient(SuccessClient value) {
        this.successClient = value;
    }

}
