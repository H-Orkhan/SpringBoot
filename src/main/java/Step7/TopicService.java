package Step7;

import javassist.NotFoundException;
import lombok.SneakyThrows;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    public List<Topic> topics = new ArrayList<>(Arrays.asList(
            new Topic(1, "Spring framework", "Description"),
            new Topic(2, "Spring framework2", "Description2"),
            new Topic(3, "Spring framework3", "Description3")
    ));

    public List<Topic> getAllTopics() {
        return topics;
    }

    @SneakyThrows
    public Topic getTopicByID(int id) {
        return topics.
                stream().
                filter(s -> s.getId() == (id)).
                findFirst()
                .orElseThrow(() -> new NotFoundException("Topic was not found"));
    }

    public void addTopic(Topic topic) {
        topics.add(topic);
    }

    @SneakyThrows
    public void updateTopic(int id, Topic topic) {
        Topic findTopic = topics
                .stream()
                .filter(value -> value.getId() == (id))
                .findAny()
                .orElseThrow(() -> new NotFoundException("Topic Not Found"));
        topics.add(topics.indexOf(findTopic), topic);
    }

    public void deleteTopicByID(int id) {
        topics.removeIf(t -> t.getId() == (id));
    }
}

