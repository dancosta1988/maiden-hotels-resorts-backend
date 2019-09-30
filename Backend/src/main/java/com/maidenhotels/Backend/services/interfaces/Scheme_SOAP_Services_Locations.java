package com.maidenhotels.Backend.services.interfaces;

public class Scheme_SOAP_Services_Locations {

    //--HOST--
    public static final String LOCALHOST = "http://localhost:";
    public static final String HOST = "http://192.168.0.77:";
    //public static final String HOST = "http://192.168.0.182:";
    //--END: HOSTS--

    //--PORTS--
    public static final String HOTEL_PORT = "10100";
    public static final String ROOM_PORT = "10103";
    public static final String SERVICE_PORT = "10101";
    public static final String CLIENT_PORT = "10106";
    public static final String GUEST_PORT = "10105";

    /*public static final String FLIGHT_PORT = "9084";
    public static final String CLIENT_PORT = "9083";
    public static final String CLIENT_TYPE_PORT = "9088";
    public static final String BACKOFFICE_PORT = "9082";
    public static final String ROLE_PORT = "9085";
    public static final String BOOKING_PORT = "9087";
    public static final String BOOKING_TYPE_PORT = "9086";*/
    //--END: PORTS--

    //-- SERVICE SPECIFICATIONS--
    public static final String HOTEL_SERVICE_SPECIFICATION = "/Maiden_Hotels_Project/ServicesCRUD_SOAP/Service_Hotels.serviceagent/PortType_Hotels";
    public static final String ROOM_SERVICE_SPECIFICATION = "/Maiden_Hotels_Project/ServicesCRUD_SOAP/Service_Rooms.serviceagent/PortType_Room";
    public static final String SERVICE_SERVICE_SPECIFICATION = "/Maiden_Hotels_Project/ServicesCRUD_SOAP/Service_Services.serviceagent/PortType_Services";
    public static final String CLIENT_SERVICE_SPECIFICATION = "/Maiden_Hotels_Project/ServicesCRUD_SOAP/Service_Clients.serviceagent/PortType_Clients";
    public static final String GUEST_SERVICE_SPECIFICATION = "/Maiden_Hotels_Project/ServicesCRUD_SOAP/Service_Guests.serviceagent/PortType_Guests";


    //--END: SERVICE SPECIFICATIONS--


    //-- HOTEL - SOAP ACTIONS--
    public static final String HOTEL_SOAP_ACTION_CREATE = "/Maiden_Hotels_Project/ServicesCRUD_SOAP/Service_Hotels.serviceagent/PortType_Hotels/insert";
    public static final String HOTEL_SOAP_ACTION_UPDATE = "/Maiden_Hotels_Project/ServicesCRUD_SOAP/Service_Hotels.serviceagent/PortType_Hotels/Update";
    public static final String HOTEL_SOAP_ACTION_DELETE = "/Maiden_Hotels_Project/ServicesCRUD_SOAP/Service_Hotels.serviceagent/PortType_Hotels/Delete";
    public static final String HOTEL_SOAP_ACTION_READ_ALL = "/Maiden_Hotels_Project/ServicesCRUD_SOAP/Service_Hotels.serviceagent/PortType_Hotels/Get_All";
    public static final String HOTEL_SOAP_ACTION_READ_BY_ID = "/Maiden_Hotels_Project/ServicesCRUD_SOAP/Service_Hotels.serviceagent/PortType_Hotels/Get_ByID";
    public static final String HOTEL_SOAP_ACTION_READ_BY_NAME ="/Maiden_Hotels_Project/ServicesCRUD_SOAP/Service_Hotels.serviceagent/PortType_Hotels/GET_ByName";
    //--END: HOTEL - SOAP ACTIONS--

    //-- ROOM - SOAP ACTIONS--
    public static final String ROOM_SOAP_ACTION_CREATE = "/Maiden_Hotels_Project/ServicesCRUD_SOAP/Service_Rooms.serviceagent/PortType_Room/Insert";
    public static final String ROOM_SOAP_ACTION_UPDATE = "/Maiden_Hotels_Project/ServicesCRUD_SOAP/Service_Rooms.serviceagent/PortType_Room/Update";
    public static final String ROOM_SOAP_ACTION_DELETE = "/Maiden_Hotels_Project/ServicesCRUD_SOAP/Service_Rooms.serviceagent/PortType_Room/Delete";
    public static final String ROOM_SOAP_ACTION_READ_ALL = "/Maiden_Hotels_Project/ServicesCRUD_SOAP/Service_Rooms.serviceagent/PortType_Room/Get_All";
    public static final String ROOM_SOAP_ACTION_READ_BY_PARAM = "/Maiden_Hotels_Project/ServicesCRUD_SOAP/Service_Rooms.serviceagent/PortType_Room/Get_ByParam";
    //--END: ROOM - SOAP ACTIONS--

    //-- SERVICE - SOAP ACTIONS--
    public static final String SERVICE_SOAP_ACTION_CREATE = "/Maiden_Hotels_Project/ServicesCRUD_SOAP/Service_Services.serviceagent/PortType_ServicesEndpoint1/Insert";
    public static final String SERVICE_SOAP_ACTION_UPDATE = "/Maiden_Hotels_Project/ServicesCRUD_SOAP/Service_Services.serviceagent/PortType_ServicesEndpoint1/Update";
    public static final String SERVICE_SOAP_ACTION_DELETE = "/Maiden_Hotels_Project/ServicesCRUD_SOAP/Service_Services.serviceagent/PortType_ServicesEndpoint1/Delete";
    public static final String SERVICE_SOAP_ACTION_READ_ALL = "/Maiden_Hotels_Project/ServicesCRUD_SOAP/Service_Services.serviceagent/PortType_ServicesEndpoint1/Get_All";
    public static final String SERVICE_SOAP_ACTION_READ_BY_PARAM = "/Maiden_Hotels_Project/ServicesCRUD_SOAP/Service_Services.serviceagent/PortType_ServicesEndpoint1/Get_ByParam";
    //--END: SERVICE - SOAP ACTIONS--

    //-- CLIENT - SOAP ACTIONS--
    public static final String CLIENT_SOAP_ACTION_CREATE = "/Maiden_Hotels_Project/ServicesCRUD_SOAP/Service_Clients.serviceagent/PortType_Clients/Insert";
    public static final String CLIENT_SOAP_ACTION_UPDATE = "/Maiden_Hotels_Project/ServicesCRUD_SOAP/Service_Clients.serviceagent/PortType_Clients/Update";
    public static final String CLIENT_SOAP_ACTION_DELETE = "/Maiden_Hotels_Project/ServicesCRUD_SOAP/Service_Clients.serviceagent/PortType_Clients/Delete";
    public static final String CLIENT_SOAP_ACTION_READ_ALL = "/Maiden_Hotels_Project/ServicesCRUD_SOAP/Service_Clients.serviceagent/PortType_Clients/Get_All";
    public static final String CLIENT_SOAP_ACTION_READ_BY_ID = "/Maiden_Hotels_Project/ServicesCRUD_SOAP/Service_Clients.serviceagent/PortType_Clients/Get_ByID";
    public static final String CLIENT_SOAP_ACTION_READ_BY_PARAM = "/Maiden_Hotels_Project/ServicesCRUD_SOAP/Service_Clients.serviceagent/PortType_Clients/Get_ByParam";
    //--END: CLIENT - SOAP ACTIONS--

    //-- CLIENT - SOAP ACTIONS--
    public static final String GUEST_SOAP_ACTION_CREATE = "/Maiden_Hotels_Project/ServicesCRUD_SOAP/Service_Guests.serviceagent/PortType_Guests/Insert";
    public static final String GUEST_SOAP_ACTION_UPDATE = "/Maiden_Hotels_Project/ServicesCRUD_SOAP/Service_Guests.serviceagent/PortType_Guests/Update";
    public static final String GUEST_SOAP_ACTION_DELETE = "/Maiden_Hotels_Project/ServicesCRUD_SOAP/Service_Guests.serviceagent/PortType_Guests/Delete";
    public static final String GUEST_SOAP_ACTION_READ_ALL = "/Maiden_Hotels_Project/ServicesCRUD_SOAP/Service_Guests.serviceagent/PortType_Guests/Get_All";
    public static final String GUEST_SOAP_ACTION_READ_BY_ID = "/Maiden_Hotels_Project/ServicesCRUD_SOAP/Service_Guests.serviceagent/PortType_Guests/Get_ByParam";
    public static final String GUEST_SOAP_ACTION_READ_BY_PARAM = "/Maiden_Hotels_Project/ServicesCRUD_SOAP/Service_Guests.serviceagent/PortType_Guests/Get_ByParam";
    //--END: CLIENT - SOAP ACTIONS--





}
