package io.example.SpringBootDemo.Controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
	
	@RequestMapping(value = "/monuments/save", method = RequestMethod.POST)			
	public void addMonument(@RequestBody HeritageBean bean) {
		heritageService.addMonument(bean);
	}
	
	@RequestMapping(value = "/monuments/update/{id}", method = RequestMethod.PUT)			
	public void updateMonument(@RequestBody HeritageBean bean, @PathVariable Integer id) {
		heritageService.updateMonument(id, bean);
	}
	
	@RequestMapping(value = "/monuments/delete/{id}", method = RequestMethod.DELETE)
	public void deleteMonument(@PathVariable Integer id) {
		heritageService.deleteMonument(id);		
		
	}
}

