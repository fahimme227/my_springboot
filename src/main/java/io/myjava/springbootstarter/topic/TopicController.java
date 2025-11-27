package io.myjava.springbootstarter.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.myjava.springbootstarter.topic.models.Topic;



@RestController
public class TopicController {
	
	
	@GetMapping("/topics")
	public List<Topic> getAllTopics() {
		
		return Arrays.asList(
				new Topic("id","JAva","description"),
				new Topic("id","JAva1.8","description1.8")
		  );
		
	}
	

}
