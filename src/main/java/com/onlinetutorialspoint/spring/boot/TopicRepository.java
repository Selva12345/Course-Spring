package com.onlinetutorialspoint.spring.boot;

import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic, String> {
	
}
	
