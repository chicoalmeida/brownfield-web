package com.brownfield.web.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UIData {
	
	private SearchQuery searchQuery;
	private List<Flight> flights;
	private Flight selectedFlight;
	private Passenger passenger;

	private String bookingid;
}