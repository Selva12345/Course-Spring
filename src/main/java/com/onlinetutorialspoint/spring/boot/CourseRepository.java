package com.onlinetutorialspoint.spring.boot;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.onlinetutorialspoint.spring.boot.Topic;
public interface CourseRepository extends CrudRepository<Course, String>{ 
	//public List<Course> getcourseByTopic(String topicId);
	public List<Course> findByName(String name);
	//public List<Course> findByDescription(String description);

}
