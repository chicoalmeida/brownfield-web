package com.brownfield.web.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Fares {

    private long id;

    private String fare;
    private String currency;

    private Fares(final String fare, final String currency) {
        this.fare = fare;
        this.currency = currency;
    }

    public static Fares createFare(final String fare, final String currency) {
        return null;
    }
}
