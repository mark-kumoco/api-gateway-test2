package com.example.demo;

import java.util.Arrays;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {
		return Arrays.asList (
			new Topic("spring", "Spring Framework", "Spring Framework Description"),
			new Topic("javascript", "JS means Javascript", "JS Description"),
			new Topic("java", "Java Coffee", "Java Description")
		);
	}
}