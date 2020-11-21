package com.jitendra.nimesa.dao;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class Weather {

	private int id;
	private String main;
	private String description;
	private String icon;
}
//{
//    "id": 803,
//    "main": "Clouds",
//    "description": "broken clouds",
//    "icon": "04n"
//}