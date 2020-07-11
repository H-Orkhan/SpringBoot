package Step4;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {
    public List<Topic> topics  = Arrays.asList(
            new Topic("1","Spring_1","Description_1"),
            new Topic("2","Spring_2","Description_2"),
            new Topic("3","Spring_3","Description_3")
    );
    public List<Topic> getAllTopics () {
        return topics;
    }
}
