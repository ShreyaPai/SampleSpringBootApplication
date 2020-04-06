package io.example.SpringBootDemo.Service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.example.SpringBootDemo.Beans.HeritageBean;

@Service
public class HeritageService {
	
	List<HeritageBean> monumentList =  Arrays.asList(
			new HeritageBean(1, "Pyramids of Giza", "Egypt"),
			new HeritageBean(2, "Lotus Temple", "Australia"),
			new HeritageBean(3, "Leaning Tower of Pisa", "Italy"),
			new HeritageBean(4, "Taj Mahal", "India"),
			new HeritageBean(5, "Christ the Redeemer", "Brazil"),
			new HeritageBean(6, "Great Wall of China", "China")
			
			);
	
	public List<HeritageBean> getMonumentDetails() {
		
		return monumentList;
	}
	
	public HeritageBean getMonumentById(Integer id) {
		return monumentList.stream().filter(x -> x.getMonumentId()==id).findFirst().get();
	}

}
