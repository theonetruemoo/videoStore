package za.co.mooInc.dao;

import za.co.mooInc.beans.Video;
import za.co.mooInc.beans.VideoItem;

public class VideoItemDAO extends HibernateDAO {
	
	
	public void insertVideoItem(VideoItem videoItem, Video video) throws Exception{
		VideoDAO vdao = new VideoDAO();
		vdao.save(video);
		super.save(videoItem);
		
	}

}
