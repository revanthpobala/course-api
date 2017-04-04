package io.revanth.springbootstarter.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

	@RequestMapping("/api/topics")
	public List<Topic> getAllTopics() {

		return Arrays.asList(new Topic("Spring", "Spring Framework", "Spring Description"),
				new Topic("Java", "Java Tutorial", "Java Description"),
				new Topic("javascript", "js", "js description"));
	}

}
