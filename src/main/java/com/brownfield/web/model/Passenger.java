package com.brownfield.web.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Passenger {

    private long id;

    private String firstName;
    private String lastName;
    private String gender;

    @JsonIgnore
    private BookingRecord bookingRecord;

    private Passenger(String firstName, String lastName, String gender, BookingRecord bookingRecord) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.bookingRecord = bookingRecord;
    }


    public static Passenger createPassenger(String firstName, String lastName, String gender, BookingRecord bookingRecord) {
        return new Passenger(firstName, lastName, gender, bookingRecord);
    }
}
