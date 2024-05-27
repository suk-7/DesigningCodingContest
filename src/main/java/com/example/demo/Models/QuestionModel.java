package com.example.demo.Models;

import com.example.demo.constant.Status;
import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Document(collection="QuestionData")
@Data
public class QuestionModel extends BaseModel{
    int score;
    Status level;
    String questionName;
}
