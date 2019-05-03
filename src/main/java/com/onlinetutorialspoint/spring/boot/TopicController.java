package com.onlinetutorialspoint.spring.boot;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	@Autowired//instance ll be created
	private TopicService topicService;
	@RequestMapping("/topics")
	public List<Topic> gettopics(){
		return topicService.gettopics();
		
	}
	@RequestMapping("/topics/{id}")
	public Optional<Topic> getTopicId(@PathVariable("id")String id){
		return topicService.getTopicId(id);
		
	}
	@RequestMapping(method=RequestMethod.POST,value="/topics")
	public void addTopicId(@RequestBody Topic topic){
		 topicService.addTopicId(topic);
		
	}

}
