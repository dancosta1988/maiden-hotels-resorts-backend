//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.10.07 at 12:28:08 PM BST 
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
 *         &lt;element ref="{http://www.tibco.com/schemas/TIBCO/Maiden_Hotels_Project/Schemas/Bookings.xsd}BookingGuest" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "bookingGuest"
})
@XmlRootElement(name = "BookingsGuests")
public class BookingsGuests {

    @XmlElement(name = "BookingGuest")
    protected List<BookingGuest> bookingGuest;

    public BookingsGuests() {
    }

    public BookingsGuests(List<BookingGuest> bookingGuest) {
        this.bookingGuest = bookingGuest;
    }

    /**
     * Gets the value of the bookingGuest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bookingGuest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBookingGuest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BookingGuest }
     * 
     * 
     */
    public List<BookingGuest> getBookingGuest() {
        if (bookingGuest == null) {
            bookingGuest = new ArrayList<BookingGuest>();
        }
        return this.bookingGuest;
    }

}
