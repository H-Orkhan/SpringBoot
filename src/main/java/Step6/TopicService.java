package Step6;

import javassist.NotFoundException;
import lombok.SneakyThrows;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    public List<Topic> topics = new ArrayList<>(Arrays.asList(
            new Topic(1, "Spring_1", "Description_1"),
            new Topic(2, "Spring_2", "Description_2"),
            new Topic(3, "Spring_3", "Description_3")
    ));

    public List<Topic> getAllTopics() {
        return topics;
    }

    @SneakyThrows
    public Topic getTopicByID(int id) {

        return topics.stream()
                .filter(s -> s.getId()==(id))
                .findFirst()
                .orElseThrow(() -> new NotFoundException("Topics are not found"));
    }

    public void addTopic(Topic topic) {
        topics.add(topic);
    }
}

