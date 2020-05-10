package Step6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TopicController {
    @Autowired
    private TopicService topicService;

    @RequestMapping(method = RequestMethod.GET,value = "/topics")
    @ResponseBody
    public  List<Topic> getAllTopics () {
        return topicService.getAllTopics();
    }

    @RequestMapping(method = RequestMethod.GET,value = "/topics/{id}")
    public Topic getTopicByID(@PathVariable String id) {
        return  topicService.getTopicByID(id);
    }

    @RequestMapping(method = RequestMethod.POST,value = "/topics")
    public void addTopic(@RequestBody Topic topic) {
            topicService.addTopic(topic);
    }

}
