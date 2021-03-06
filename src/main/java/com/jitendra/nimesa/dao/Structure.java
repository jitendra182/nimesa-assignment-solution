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
public class Structure {
	
	private String cod;
	private String message;
	private int cnt;
	
	private List<DataList> list;
	private City city;

}

//"cod": "200",
//"message": 0.0151,
//"cnt": 96,
//"list": [
//         {
//            "dt": 1553709600,
//            "main": {
//                "temp": 278.76,
//                "temp_min": 278.76,
//                "temp_max": 279.558,
//                "pressure": 1031.934,
//                "sea_level": 1031.934,
//                "grnd_level": 971.745,
//                "humidity": 100,
//                "temp_kf": -0.8
//            },
//            "weather": [
//                {
//                    "id": 803,
//                    "main": "Clouds",
//                    "description": "broken clouds",
//                    "icon": "04n"
//                }
//            ],
//            "clouds": {
//                "all": 77
//            },
//            "wind": {
//                "speed": 1.6,
//                "deg": 40.932
//            },
//            "sys": {
//                "pod": "n"
//            },
//            "dt_txt": "2019-03-27 18:00:00"
//        }
//         "city": {
//              "id": 2867714,
//              "name": "Munich",
//              "coord": {
//                  "lat": 48.1371,
//                  "lon": 11.5754
//              },
//              "country": "DE",
//              "population": 1260391
       
//        }