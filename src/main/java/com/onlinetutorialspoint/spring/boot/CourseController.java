package com.onlinetutorialspoint.spring.boot;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
	@Autowired//instance ll be created
	private CourseService courseService;
	@RequestMapping("/topics/{id}/courses")
	public List<Course> getAllCourses(@PathVariable String id){
		return courseService.getAllCourses(id);
		
	}
	@RequestMapping("/topics/name/{id}")
	public List<Course> getByName(@PathVariable String id){
		return courseService.getByName(id);
		
	}
	@RequestMapping("/topics/{topicId}/courses/{id}")
	public Optional<Course> getTopicId(@PathVariable("id")String id){
		return courseService.getCourse(id);
		
	}
	@RequestMapping(method=RequestMethod.POST,value="/topics/courses")
	public void addTopicId(@RequestBody Course topic){
		courseService.addCourse(topic);
		
	}

}
