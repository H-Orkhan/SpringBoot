package Step3;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/app")
public class TopicController {

    @RequestMapping("/topics")
    public List<Topic> getAllTopics() {
        return Arrays.asList(
                new Topic(1, "Spring_1", "Description_1"),
                new Topic(2, "Spring_2", "Description_2"),
                new Topic(3, "Spring_3", "Description_3")
        );
    }
}
