package springcourse;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Arrays;

@RestController
public class TopicController {

    @RequestMapping("/topics")
    public List<Topic> getAllTopics()
    {
        return Arrays.asList(
        new Topic("Spring", "Spring Framework", "Spring Description"),
        new Topic("Java", "Java Framework", "Java Framework Description"),
        new Topic("JavaScript", "JavaScript Framework", "Java Script Description")
        );

    }
}
