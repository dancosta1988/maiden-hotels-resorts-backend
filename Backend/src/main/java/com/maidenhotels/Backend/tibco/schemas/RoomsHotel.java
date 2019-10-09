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
 *       &lt;attribute name="id_hotel" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="id_rooms" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="room_number" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "roomsHotel", namespace = "http://www.tibco.com/schemas/TIBCO/Maiden_Hotels_Project/Schemas/RoomsHotel.xsd")
public class RoomsHotel {

    @XmlAttribute(name = "cost")
    protected String cost;
    @XmlAttribute(name = "id")
    protected String id;
    @XmlAttribute(name = "id_hotel")
    protected String idHotel;
    @XmlAttribute(name = "id_rooms")
    protected String idRooms;
    @XmlAttribute(name = "room_number")
    protected String roomNumber;

    public RoomsHotel() {
    }

    public RoomsHotel(String cost, String id, String idHotel, String idRooms, String roomNumber) {
        this.cost = cost;
        this.id = id;
        this.idHotel = idHotel;
        this.idRooms = idRooms;
        this.roomNumber = roomNumber;
    }

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
     * Gets the value of the idHotel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdHotel() {
        return idHotel;
    }

    /**
     * Sets the value of the idHotel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdHotel(String value) {
        this.idHotel = value;
    }

    /**
     * Gets the value of the idRooms property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdRooms() {
        return idRooms;
    }

    /**
     * Sets the value of the idRooms property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdRooms(String value) {
        this.idRooms = value;
    }

    /**
     * Gets the value of the roomNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomNumber() {
        return roomNumber;
    }

    /**
     * Sets the value of the roomNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomNumber(String value) {
        this.roomNumber = value;
    }

}
