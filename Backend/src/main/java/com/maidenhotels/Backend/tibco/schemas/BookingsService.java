//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.10.07 at 12:28:08 PM BST 
//


package com.maidenhotels.Backend.tibco.schemas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *       &lt;attribute name="cost" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="id_booking" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="id_service_hotel" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "BookingsService")
public class BookingsService {

    @XmlAttribute(name = "cost")
    protected String cost;
    @XmlAttribute(name = "id")
    protected String id;

    public BookingsService() {
    }

    public BookingsService(String cost, String id, String idBooking, String idServiceHotel) {
        this.cost = cost;
        this.id = id;
        this.idBooking = idBooking;
        this.idServiceHotel = idServiceHotel;
    }

    @XmlAttribute(name = "id_booking")
    protected String idBooking;
    @XmlAttribute(name = "id_service_hotel")
    protected String idServiceHotel;

    /**
     * Gets the value of the cost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCost() {
        return cost;
    }

    /**
     * Sets the value of the cost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCost(String value) {
        this.cost = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the idBooking property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdBooking() {
        return idBooking;
    }

    /**
     * Sets the value of the idBooking property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdBooking(String value) {
        this.idBooking = value;
    }

    /**
     * Gets the value of the idServiceHotel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdServiceHotel() {
        return idServiceHotel;
    }

    /**
     * Sets the value of the idServiceHotel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdServiceHotel(String value) {
        this.idServiceHotel = value;
    }

}
