package com.jitendra.nimesa.dao;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class City {

	private int id;
	private String name;
	private Coord coord;
	private String country;
	private int population;
	
	
}



//"city": {
//    "id": 2867714,
//    "name": "Munich",
//    "coord": {
//        "lat": 48.1371,
//        "lon": 11.5754
//    },
//    "country": "DE",
//    "population": 1260391