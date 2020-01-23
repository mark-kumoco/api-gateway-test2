package com.example.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	private List<Topic> topics = Arrays.asList (
			new Topic("spring", "Spring Framework", "Spring Framework Description"),
			new Topic("javascript", "JS means Javascript", "JS Description"),
			new Topic("java", "Java Coffee", "Java Description")
		);
	
	public List<Topic> getAllTopics() {
		return topics;
	}
	
	public Topic getTopic(String id) {
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}
}