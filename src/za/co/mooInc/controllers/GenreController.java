package za.co.mooInc.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;



import javax.faces.model.SelectItem;

import za.co.mooInc.beans.Genre;
import za.co.mooInc.dao.GenreDAO;


@ManagedBean(name="genreController")
@SessionScoped
public class GenreController {
	
	
	public ArrayList<SelectItem> allGenres;
	
	public ArrayList<SelectItem> getAllGenreAsSelectItems(){
		
		if(allGenres==null){
			allGenres = new ArrayList<SelectItem>();
		GenreDAO gdao = new GenreDAO();
		try{
		List<Genre> genres =  gdao.getAllGenre();
		
		
		for(int a =0; a<genres.size(); a++){
			SelectItem select = new SelectItem(genres.get(a).getId(),genres.get(a).getDescription());
			allGenres.add(select);
		}
		
		}catch(Exception e){
			e.printStackTrace();
		}
		
		}
		
		return allGenres;
	}

}
