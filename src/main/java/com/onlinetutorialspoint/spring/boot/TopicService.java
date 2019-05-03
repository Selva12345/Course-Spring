package com.onlinetutorialspoint.spring.boot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	@Autowired
	private TopicRepository topicRepository;
	
	
	public List<Topic> gettopics(){
		List<Topic> topic=new ArrayList<>();
		
		 topicRepository.findAll()
		 .forEach(topic::add);	
		 return topic;
		//return topics;
		
		
	}

	public Optional<Topic> getTopicId(String id) {
		return topicRepository.findById(id);
		//return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
		//return topicRepository.;
		
	}

	public Topic updateTopicId(Topic topic) {
		
		return topicRepository.save(topic);
	}

	public void addTopicId(Topic topic) {
		topicRepository.save(topic);
		
	}

}
