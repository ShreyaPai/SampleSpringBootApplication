package io.example.SpringBootDemo.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.example.SpringBootDemo.Beans.HeritageBean;

@Service
public class HeritageService {
	
	List<HeritageBean> monumentList =  new ArrayList<>(Arrays.asList(
			new HeritageBean(1, "Pyramids of Giza", "Egypt"),
			new HeritageBean(2, "Lotus Temple", "Australia"),
			new HeritageBean(3, "Leaning Tower of Pisa", "Italy"),
			new HeritageBean(4, "Taj Mahal", "India"),
			new HeritageBean(5, "Christ the Redeemer", "Brazil"),
			new HeritageBean(6, "Great Wall of China", "China")
			
			));
	
	public List<HeritageBean> getMonumentDetails() {
		
		return monumentList;
	}
	
	public HeritageBean getMonumentById(Integer id) {
		return monumentList.stream().filter(x -> x.getMonumentId()==id).findFirst().get();
	}

	public void addMonument(HeritageBean bean) {
		// TODO Auto-generated method stub
		monumentList.add(bean);
	}

	public void updateMonument(Integer id, HeritageBean bean) {
		// TODO Auto-generated method stub
		for(int index = 0; index < monumentList.size(); index ++) {
			HeritageBean heritageBean = monumentList.get(index);
			if(heritageBean.getMonumentId() == id) {
				monumentList.set(index, bean);
				return;
			}
		}
		
	}

	public void deleteMonument(Integer id) {
		// TODO Auto-generated method stub
		monumentList.removeIf(x -> x.getMonumentId() == id);
	}

	
	

}
