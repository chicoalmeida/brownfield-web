package com.brownfield.web.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Flight {

    private long id;

    private String flightNumber;
    private String origin;
    private String destination;
    private String flightDate;

    private Fares fares;

    private Flight(String flightNumber, String origin, String destination, String flightDate, Fares fares) {
        super();
        this.flightNumber = flightNumber;
        this.origin = origin;
        this.destination = destination;
        this.flightDate = flightDate;
        this.fares = fares;
    }

    public static Flight createFlight(String flightNumber, String origin, String destination, String flightDate, Fares fares) {
        return new Flight(flightNumber, origin, destination, flightDate, fares);
    }
}
