package Step5;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class TopicController {

    private final TopicService topicService;

    @GetMapping
    public List<Topic> getAllTopics() {
        return topicService.getAllTopics();
    }

    @GetMapping("/topics/{id}")
    public Topic getTopicByID(@PathVariable int id) {
        return topicService.getTopicByID(id);
    }

}
