package Step6;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    public List<Topic> topics = new ArrayList<>(Arrays.asList(
            new Topic("Spring", "Spring framework", "Description"),
            new Topic("Spring2", "Spring framework2", "Description2"),
            new Topic("Spring3", "Spring framework3", "Description3")
    ));

    public List<Topic> getAllTopics() {
        return topics;
    }

    public Topic getTopicByID(String id) {
        return topics.stream().filter(s -> s.getId().equals(id)).findFirst().get();
    }

    public void addTopic(Topic topic) {
            topics.add(topic);
    }
}

