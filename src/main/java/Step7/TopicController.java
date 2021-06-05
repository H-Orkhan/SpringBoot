package Step7;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/app")
@RequiredArgsConstructor
public class TopicController {

    private final TopicService topicService;

    @GetMapping("/topics")
    public List<Topic> getAllTopics() {
        return topicService.getAllTopics();
    }

    @GetMapping("/topics/{id}")
    public Topic getTopicByID(@PathVariable int id) {
        return topicService.getTopicByID(id);
    }

    @PostMapping("/topics/add")
    public void addTopic(@RequestBody Topic topic) {
        topicService.addTopic(topic);
    }

    @PutMapping("/topics/{id}")
    public void updateTopic(@RequestBody Topic topic, @PathVariable int id) {
        topicService.updateTopic(id, topic);
    }

    @DeleteMapping("/topics/{id}")
    public void deleteTopic(@PathVariable int id) {
        topicService.deleteTopicByID(id);
    }
}
