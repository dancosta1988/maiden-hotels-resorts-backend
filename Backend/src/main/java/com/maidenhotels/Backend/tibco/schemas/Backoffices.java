//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.10.11 at 09:29:45 AM BST 
//


package com.maidenhotels.Backend.tibco.schemas;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element ref="{http://www.tibco.com/schemas/TIBCO/Maiden_Hotels_Project/Schemas/Schema.xsd2}Backoffice" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "backoffice"
})
@XmlRootElement(name = "Backoffices", namespace = "http://www.tibco.com/schemas/TIBCO/Maiden_Hotels_Project/Schemas/Schema.xsd2")
public class Backoffices {

    @XmlElement(name = "Backoffice", namespace = "http://www.tibco.com/schemas/TIBCO/Maiden_Hotels_Project/Schemas/Schema.xsd2")
    protected List<Backoffice> backoffice;

    public Backoffices() {
    }

    public Backoffices(List<Backoffice> backoffice) {
        this.backoffice = backoffice;
    }

    /**
     * Gets the value of the backoffice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the backoffice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBackoffice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Backoffice }
     * 
     * 
     */
    public List<Backoffice> getBackoffice() {
        if (backoffice == null) {
            backoffice = new ArrayList<Backoffice>();
        }
        return this.backoffice;
    }

}
