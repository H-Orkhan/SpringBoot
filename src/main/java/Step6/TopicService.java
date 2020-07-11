package Step6;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    public List<Topic> topics = new ArrayList<>(Arrays.asList(
            new Topic("1","Spring_1","Description_1"),
            new Topic("2","Spring_2","Description_2"),
            new Topic("3","Spring_3","Description_3")
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

