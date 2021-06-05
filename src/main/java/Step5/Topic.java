package Step5;


import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Topic {
    private int id;
    private String name;
    private String description;
}
