package Step5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TopicController {
    @Autowired
    private TopicService topicService;

    @RequestMapping("/topics")
    @ResponseBody
    public  List<Topic> getAllTopics () {
        return topicService.getAllTopics();
    }

    //We use @RequestMapping with ID to check and choose the ID that we need
    //We use @PathVariable for help String to understand what variable does it need
    @RequestMapping("/topics/{id}")
    public Topic getTopicByID(@PathVariable String id) {
        return  topicService.getTopicByID(id);
    }

}
