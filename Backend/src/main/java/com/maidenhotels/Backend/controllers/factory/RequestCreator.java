package com.maidenhotels.Backend.controllers.factory;

import com.maidenhotels.Backend.tibco.schemas.*;
import com.maidenhotels.Backend.tibco.schemas.Clients;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Component
public class RequestCreator {
    // ---- ---- HOTELS ---- ---- //
    public Hotels createHotels(String classification, String id, String location, String name, String type) {

        Hotel hotel = new Hotel(classification, id, location, name, type);
        Hotels request = new Hotels();
        request.getHotel().add(hotel);
        return request;
    }
    public Hotels createHotelsID(String id) {

        Hotel hotel = new Hotel();
        hotel.setId(id);
        Hotels request = new Hotels();
        request.getHotel().add(hotel);
        return request;
    }

    // ---- ---- ROOMS ---- ---- //
    public Rooms createRooms(String beds, String divisions, String id, String size, String type) {

        Room room = new Room(beds, divisions, id, size, type);
        Rooms request = new Rooms();
        request.getRoom().add(room);
        return request;
    }
    public Rooms createRoomsID(String id) {

        Room room = new Room();
        room.setId(id);
        Rooms request = new Rooms();
        request.getRoom().add(room);
        return request;
    }

    // ---- ---- SERVICES ---- ---- //
    public Services createServices(String id, String name) {

        Service service = new Service(id, name);
        Services request = new Services();
        request.getService().add(service);
        return request;
    }
    public Services createServicesID(String id) {

        Service service = new Service();
        service.setId(id);
        Services request = new Services();
        request.getService().add(service);
        return request;
    }

    // ---- ---- CLIENTS ---- ---- //
    public Clients createClients(List<Guest> guestClient, String id, String idGuest, String moneySpent, String password) {

        Client client = new Client(guestClient,  id,  idGuest, moneySpent, password);
        Clients request = new Clients();
        request.getClient().add(client);
        return request;
    }
    public Clients createClientsID(String id) {

        Client client = new Client();
        client.setId(id);
        Clients request = new Clients();
        request.getClient().add(client);
        return request;
    }

    // ---- ---- GUESTS ---- ---- //
    public Guests createGuests(String address, String contactNumber, String dateOfBirth, String email, String firstName, String gender, String id, String idNumber, String lastName, String status) {

        Guest guest = new Guest(address, contactNumber, dateOfBirth, email, firstName, gender, id, idNumber, lastName, status);
        Guests request = new Guests();
        request.getGuest().add(guest);
        return request;
    }
    public Guests createGuestsID(String id) {

        Guest guest = new Guest();
        guest.setId(id);
        Guests request = new Guests();
        request.getGuest().add(guest);
        return request;
    }

}
