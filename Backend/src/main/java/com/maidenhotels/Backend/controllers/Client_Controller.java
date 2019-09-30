package com.maidenhotels.Backend.controllers;

import com.maidenhotels.Backend.controllers.factory.RequestCreator;
import com.maidenhotels.Backend.services.Clients_services;
import com.maidenhotels.Backend.tibco.schemas.Client;
import com.maidenhotels.Backend.tibco.schemas.Clients;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("Clients")
public class Client_Controller {

    @Autowired
    private Clients_services clients;
    //Creates objects with less and repeatable cod
    // Example: To create Clients: we need to create Client, set the attributes, instantiate Clients and then add Client to Clients
    @Autowired
    private RequestCreator factory;


    @GetMapping
    public List<Client> getAllClients(){
        System.out.println("Getting all clients");
        return clients.getAll();
    }

    @PostMapping("ClientByID")
    public List<Client> getClient(@RequestBody Client request ) {

        Clients clientsReq = new Clients();
        clientsReq.getClient().add(request);
        return clients.getByID(clientsReq);
    }

    @PostMapping("ClientCreate")
    public String createClient(@RequestBody Client request ) {

        Clients clientsReq = new Clients();
        clientsReq.getClient().add(request);
        return clients.create(clientsReq);
    }

    @PostMapping("ClientDelete")
    public String deleteClient(@RequestBody Client request ) {

        Clients clientsReq = new Clients();
        clientsReq.getClient().add(request);
        return clients.delete(clientsReq);
    }

    @PostMapping("ClientUpdate")
    public String UpdateClient(@RequestBody Client request ) {

        Clients clientsReq = new Clients();
        clientsReq.getClient().add(request);
        return clients.update(clientsReq);
    }
}
