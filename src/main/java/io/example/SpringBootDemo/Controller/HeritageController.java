package io.example.SpringBootDemo.Controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.example.SpringBootDemo.Beans.HeritageBean;
import io.example.SpringBootDemo.Service.HeritageService;

@RestController
public class HeritageController {

	@Autowired
	private HeritageService heritageService;
	
	@RequestMapping(value = "/monuments")
	public List<HeritageBean> getMonumentDetails() {
		return heritageService.getMonumentDetails();
	}
	
	@RequestMapping(value = "/monuments/{id}")
	public HeritageBean getMonumentById(@PathVariable Integer id) {
		return heritageService.getMonumentById(id);
		
		
	}
}
