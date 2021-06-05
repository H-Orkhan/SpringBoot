package Step7;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Topic {
    private int id;
    private String name;
    private String description;
}
