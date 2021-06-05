package Step8;

import javassist.NotFoundException;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
@RequiredArgsConstructor
public class TopicService {
    private final TopicRepo topicRepo;

    public List<Topic> getAllTopics() {
        return topicRepo.findAll();
    }

    @SneakyThrows
    public Topic getTopicByID(int id) {
        return topicRepo.findById(id).orElseThrow(() -> new NotFoundException("Topic not found"));
    }

    public void addTopic(Collection<Topic> topics) {
        topicRepo.saveAll(topics);
    }

    @SneakyThrows
    public void updateTopic(int id, Topic topic) {
        topic.setId(id);
        topicRepo.save(topic);
    }

    public void deleteTopicByID(int id) {
        topicRepo.deleteById(id);
    }

}

