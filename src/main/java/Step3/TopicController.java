package Step3;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {

    @RequestMapping("/topics")
    public List<Topic> getAllTopics () {
        return Arrays.asList(
                new Topic("Spring","Spring framework","Description"),
                new Topic("Spring2","Spring framework2","Description2"),
                new Topic("Spring3","Spring framework3","Description3")
        );
    }
}
