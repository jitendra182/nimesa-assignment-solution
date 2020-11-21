package com.jitendra.nimesa.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.jitendra.nimesa.dao.DataList;
import com.jitendra.nimesa.dao.Main;
import com.jitendra.nimesa.dao.Structure;
import com.jitendra.nimesa.dao.Weather;

@Service
public class DataService {

	
	private RestTemplate  restTemplate= new RestTemplate();
	
	private Structure structureData;
	
	public Structure getData()
	{
		try {
		String url="https://samples.openweathermap.org/data/2.5/forecast/hourly?q=London,us&appid=b6907d289e10d714a6e88b30761fae22";
		Structure data = restTemplate.getForObject(url, Structure.class);
		this.structureData = data;
		return data;
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return this.structureData;
		
	}
	
	
	public String returnMaxTempDay()
	{
		List<DataList> dataList = this.structureData.getList();
		double temp = 0;
		String date = "";
		for(int i=0;i<dataList.size();i++)
		{
			DataList data = dataList.get(i);
			double d = data.getMain().getTemp();
			if(d>temp)
			{
				temp=d;
				date = data.getDt_txt();
			}
//			String d[] = data.getDt_txt().split(" ");
		}
		return date;
	}
	
	public Map<String, String> returnDataForDate(String date)
	{
		List<DataList> dataList = this.structureData.getList();
		Map<String, String> map = new HashMap<String, String>();
		for(int i=0;i<dataList.size();i++)
		{
			if(dataList.get(i).getDt_txt().equalsIgnoreCase(date))
			{
				Main ma = dataList.get(i).getMain();
				map.put("temp_min", String.valueOf(ma.getTemp_min()));
				map.put("temp_max", String.valueOf(ma.getTemp_max()));
				map.put("humidity", String.valueOf(ma.getHumidity()));
				
				String main = dataList.get(i).getWeather().get(0).getMain();
				map.put("main", main);
				
				
			}
		}
		
		return map;
	}
	
	
	public List<String> returnListofRainDates()
	{
		List<String> dates = new ArrayList<String>();
		
		List<DataList> dList = this.structureData.getList();
		
		for(int i=0;i<dList.size();i++)
		{
			DataList data = dList.get(i);
			List<Weather> wlist= data.getWeather();
			for(int j=0;j<wlist.size();j++)
			{
				if(wlist.get(j).getMain().equalsIgnoreCase("Rain"))
				{
					dates.add(data.getDt_txt());
				}
			}
		}
		
		return dates;
	}
	
	
	
}
