package za.co.mooInc.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;



import javax.faces.model.SelectItem;

import za.co.mooInc.beans.Actor;
import za.co.mooInc.beans.Genre;
import za.co.mooInc.dao.ActorDAO;
import za.co.mooInc.dao.GenreDAO;


@ManagedBean(name="actorController")
@SessionScoped
public class ActorController {
	
	
	public ArrayList<SelectItem> allActors;
	
	public ArrayList<SelectItem> getAllActorsSelectItem(){
		
		if(allActors==null){
			allActors = new ArrayList<SelectItem>();
		ActorDAO adao = new ActorDAO();
		try{
		List<Actor> actors =  adao.getAllActors();
		
		
		for(int a =0; a<actors.size(); a++){
			SelectItem select = new SelectItem(actors.get(a).getId(),actors.get(a).getFullName());
			allActors.add(select);
		}
		
		}catch(Exception e){
			e.printStackTrace();
		}
		
		}
		
		return allActors;
	}

}
