package com.jitendra.nimesa.dao;

import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class DataList {

	private Long dt;
	private Main main;
	private List<Weather> weather;
	private Cloud clouds;
	private Wind wind;
	private Sys sys;
	private String dt_txt;
}
//{
//    "dt": 1553709600,
//    "main": {
//        "temp": 278.76,
//        "temp_min": 278.76,
//        "temp_max": 279.558,
//        "pressure": 1031.934,
//        "sea_level": 1031.934,
//        "grnd_level": 971.745,
//        "humidity": 100,
//        "temp_kf": -0.8
//    },
//    "weather": [
//        {
//            "id": 803,
//            "main": "Clouds",
//            "description": "broken clouds",
//            "icon": "04n"
//        }
//    ],
//    "clouds": {
//        "all": 77
//    },
//    "wind": {
//        "speed": 1.6,
//        "deg": 40.932
//    },
//    "sys": {
//        "pod": "n"
//    },
//    "dt_txt": "2019-03-27 18:00:00"
//}