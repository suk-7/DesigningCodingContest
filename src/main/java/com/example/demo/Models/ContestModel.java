package com.example.demo.Models;

import com.example.demo.constant.Status;
import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection="ContestData")
@Data
public class ContestModel extends BaseModel{
    String name;
    Long userId;
    Status level;
    ContestQuestion contestQuestion;
}
