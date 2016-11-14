package com.brownfield.web.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CheckInRecord {
    private long id;

    private String lastName;
    private String firstName;
    private String seatNumber;
    private Date checkInTime;
    private String flightNumber;
    private String flightDate;
    private long bookingId;

    private CheckInRecord(String lastName, String firstName, String seatNumber, Date checkInTime, String flightNumber,
                          String flightDate, long bookingId) {
        super();
        this.lastName = lastName;
        this.firstName = firstName;
        this.seatNumber = seatNumber;
        this.checkInTime = checkInTime;
        this.flightNumber = flightNumber;
        this.flightDate = flightDate;
        this.bookingId = bookingId;
    }

    public static CheckInRecord createCheckInRecord(String lastName, String firstName, String seatNumber, Date checkInTime, String flightNumber,
                                                    String flightDate, long bookingId) {
        return new CheckInRecord(lastName, firstName, seatNumber, checkInTime, flightNumber, flightDate, bookingId);
    }
}
