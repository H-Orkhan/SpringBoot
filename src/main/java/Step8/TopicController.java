package Step8;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TopicController {

    @Autowired
    private TopicService topicService;

    @GetMapping("/")
    public String showHello() {
        return "Hello";
    }

    @GetMapping("/topics")
    public  List<Topic> getAllTopics () {
        return topicService.getAllTopics();
    }

    @GetMapping("/topics/{id}")
    public Topic getTopicByID(@PathVariable String id) {
        return  topicService.getTopicByID(id);
    }

    @PostMapping("/topics")
    public void addTopic(@RequestBody List<Topic> topics) {
            topicService.addTopic(topics);
    }

    @PutMapping("/topics/{id}")
    public void updateTopic(@RequestBody Topic topic, @PathVariable String id) {
        topicService.updateTopic(id,topic);
    }

    @DeleteMapping("/topics/{id}")
    public void deleteTopic(@RequestBody Topic topic, @PathVariable String id) {
        topicService.deleteTopicByID(id);
    }

}
