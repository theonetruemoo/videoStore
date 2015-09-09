package za.co.mooInc.controllers;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

@ManagedBean(name = "gallery")
public class GalleryViewier {
	
	
	private List<String> images;
    
    @PostConstruct
    public void init() {
        images = new ArrayList<String>();
        for (int i = 1; i <= 4; i++) {
            images.add("image" + i + ".png");
        }
    }
 
    public List<String> getImages() {
        return images;
    }

}
