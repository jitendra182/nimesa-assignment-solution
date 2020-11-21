package com.jitendra.nimesa.dao;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class Coord {

	private double lat;
	private double lon;
}

//"coord": {
//    "lat": 48.1371,
//    "lon": 11.5754
//}