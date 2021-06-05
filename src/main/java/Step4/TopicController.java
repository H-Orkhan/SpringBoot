package Step4;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
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
}
