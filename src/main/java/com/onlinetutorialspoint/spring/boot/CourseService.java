package com.onlinetutorialspoint.spring.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.onlinetutorialspoint.spring.boot.Topic;
import com.onlinetutorialspoint.spring.boot.TopicRepository;
@Service
public class CourseService {

	
	@Autowired
	private CourseRepository courseRepository;
	
	
	public List<Course> getAllCourses(String Id){
		List<Course> course=new ArrayList<>();
		//course.listIterator();
	course.addAll((Collection<? extends Course>) courseRepository.findAll());
	//course.addAll(courseRepository.findByTopicId(Id));
		// .forEach(course::add);	
		 return course;
		//return topics;
		
		
	}

	public Optional<Course> getCourse(String id) {
		return courseRepository.findById(id);
		//return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
		//return topicRepository.;
		
	}

	public Course updateCourse(Course course) {
		
		return courseRepository.save(course);
	}

	public void addCourse(Course course) {
		courseRepository.save(course);
		
	}

	public List<Course> getByName(String id) {
		return courseRepository.findByName(id);
	}



}
