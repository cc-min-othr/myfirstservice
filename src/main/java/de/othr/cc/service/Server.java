package de.othr.cc.service;

import javax.xml.ws.Endpoint;
import java.io.IOException;

public class Server {

    private static final String MY_IP = "172.20.37.109";
    private static final int  MY_PORT = 8081;


    public static void main(String[] args) throws IOException {
        StudentService studentService = new StudentService();

        // Skeleton und Laufzeitsystem des/der Service(s) starten
        Endpoint.publish("http://" + MY_IP + ":" + MY_PORT + "/ws/StudentService", studentService);

        System.out.println("StudentService gestartet!");

        System.in.read();
    }

}
