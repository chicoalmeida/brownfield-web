package com.brownfield.web.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SearchQuery {
    private String origin;
    private String destination;
    private String flightDate;
}