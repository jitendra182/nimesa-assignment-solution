package com.jitendra.nimesa.dao;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class Main {

	private double temp;
	private double temp_min;
	private double temp_max;
	private double pressure;
	private double sea_level;
	private double grnd_level;
	private int  humidity;
	private double temp_kf;
}
//"temp": 278.76,
//"temp_min": 278.76,
//"temp_max": 279.558,
//"pressure": 1031.934,
//"sea_level": 1031.934,
//"grnd_level": 971.745,
//"humidity": 100,
//"temp_kf": -0.8