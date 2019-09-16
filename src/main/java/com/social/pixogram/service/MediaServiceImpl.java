package com.social.pixogram.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.social.pixogram.model.Media;
import com.social.pixogram.model.User;
import com.social.pixogram.repository.MediaRepository;

@Service
public class MediaServiceImpl implements MediaService {

	@Autowired
	MediaRepository mediaRepo;

	@Override
	public List<Media> getUsersMedia(int userId) {
		return (List<Media>) mediaRepo.findAll();
	}

	@Override
	public Media postMedia(Media m) {
		// TODO Auto-generated method stub
		return mediaRepo.save(new Media(m.getUserId(), m.getUrl(), m.getTitle(), m.getDescription(), m.getTags()));
	}

	@Override
	public List<Media> getFollowingsMedia(long Id) {
		// TODO Auto-generated method stub
		return mediaRepo.getFollowingsMedia(Id);
	}

	@Override
	public List<User> getUserName(long id) {
		// TODO Auto-generated method stub
		return mediaRepo.getUserName(id);
	}

}




