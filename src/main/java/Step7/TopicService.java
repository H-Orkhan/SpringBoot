package Step7;

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

    public void updateTopic(String id,Topic topic) {
        for (int i=0;i<topics.size();i++) {
            Topic t =topics.get(i);
            if (t.getId().equals(id)) {
                topics.set(i,topic);
                return;
            }
        }
    }
    public void deleteTopicByID(String id) {
        topics.removeIf(t->t.getId().equals(id));
    }
}

