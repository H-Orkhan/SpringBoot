package Step8;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Service
public class TopicService {

    @Autowired
    private TopicRepo topicRepo;

    public List<Topic> getAllTopics() {
        List<Topic>topics=new ArrayList<>();
        topicRepo.findAll().forEach(topics::add);
        return topics;
    }

    public Topic getTopicByID(String id) {
        Optional<Topic> optionalTopic = topicRepo.findById(id);
      return optionalTopic.orElseGet(Topic::new);
    }

    public void addTopic(Collection<Topic> topics) {
        topicRepo.saveAll(topics);
    }

    public void updateTopic(String id, Topic topic) {
        topicRepo.save(topic);
    }

    public void deleteTopicByID(String id) {
        topicRepo.deleteById(id);
    }

}

