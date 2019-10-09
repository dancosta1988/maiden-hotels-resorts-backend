package com.maidenhotels.Backend.services;


import com.maidenhotels.Backend.services.interfaces.Scheme_SOAP_Services_Locations;
import com.maidenhotels.Backend.services.interfaces.ServicesModel;
import com.maidenhotels.Backend.services.interfaces.Services_Interface;
import com.maidenhotels.Backend.tibco.schemas.Booking;
import com.maidenhotels.Backend.tibco.schemas.Bookings;
import com.maidenhotels.Backend.tibco.schemas.StatusBooking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.client.core.WebServiceTemplate;

import java.util.List;

@org.springframework.stereotype.Service
public class Bookings_services implements Services_Interface<Bookings, Booking> {

    @Autowired
    private ServicesModel<Bookings, StatusBooking> operations;

    private WebServiceTemplate template;
    String uri = Scheme_SOAP_Services_Locations.HOST + Scheme_SOAP_Services_Locations.BOOKING_PORT + Scheme_SOAP_Services_Locations.BOOKING_SERVICE_SPECIFICATION;


    @Override
    public List<Booking> getAll() {

        Bookings request = new Bookings(); // --> send an empty ServicesHotel
        Bookings dataOutput = operations.getResult(uri,Scheme_SOAP_Services_Locations.BOOKING_SOAP_ACTION_READ_ALL,request);
        return dataOutput.getBooking();
    }

    public List<Booking> getByParam(Bookings request) {

        Bookings dataOutput = operations.getResult(uri,Scheme_SOAP_Services_Locations.BOOKING_SOAP_ACTION_READ_BY_PARAM,request);
        return dataOutput.getBooking();
    }

    public List<Booking> getByRoom(Bookings request) {

        Bookings dataOutput = operations.getResult(uri,Scheme_SOAP_Services_Locations.BOOKING_SOAP_ACTION_READ_BY_ROOM,request);
        return dataOutput.getBooking();
    }

    @Override
    public String create(Bookings request) {

        StatusBooking dataOutput = operations.getStatus(uri, Scheme_SOAP_Services_Locations.BOOKING_SOAP_ACTION_CREATE, request);
        return dataOutput.getSuccessBooking().getValue();
    }

    @Override
    public String update(Bookings request) {

        StatusBooking dataOutput = operations.getStatus(uri, Scheme_SOAP_Services_Locations.BOOKING_SOAP_ACTION_UPDATE, request);
        return dataOutput.getSuccessBooking().getValue();
    }

    @Override
    public String delete(Bookings request) {

        StatusBooking dataOutput = operations.getStatus(uri, Scheme_SOAP_Services_Locations.BOOKING_SOAP_ACTION_DELETE, request);
        return dataOutput.getSuccessBooking().getValue();
    }


    public String updateServices(Bookings request) {

        StatusBooking dataOutput = operations.getStatus(uri, Scheme_SOAP_Services_Locations.BOOKING_SOAP_ACTION_UPDATE_SERVICES, request);
        return dataOutput.getSuccessBooking().getValue();
    }

    public String updateGuests(Bookings request) {

        StatusBooking dataOutput = operations.getStatus(uri, Scheme_SOAP_Services_Locations.BOOKING_SOAP_ACTION_UPDATE_GUESTS, request);
        return dataOutput.getSuccessBooking().getValue();
    }

    public String updateRooms(Bookings request) {

        StatusBooking dataOutput = operations.getStatus(uri, Scheme_SOAP_Services_Locations.BOOKING_SOAP_ACTION_UPDATE_ROOMS, request);
        return dataOutput.getSuccessBooking().getValue();
    }

    public String insertServices(Bookings request) {

        StatusBooking dataOutput = operations.getStatus(uri, Scheme_SOAP_Services_Locations.BOOKING_SOAP_ACTION_INSERT_SERVICES, request);
        return dataOutput.getSuccessBooking().getValue();
    }

}
