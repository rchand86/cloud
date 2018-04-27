package com.ignis.example.datasevice.resource;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/db")
public class DataResource {
	
	public DataResource(){
		prepareList();
	}
	
	private List<String> data;
	
	@GetMapping("/{name}")
	public List<String> getDetailList(@PathVariable("name") final String name){
		List<String> list = new ArrayList<>();
		 for(String obj:data){
			 if(obj.equalsIgnoreCase(name)){
				 list.add(obj) ;
			 }
		 }
		return list;
	}
	
	private void prepareList(){
		data = new ArrayList<>();
		data.add("Gagan");
		data.add("Singh");
	}

}
