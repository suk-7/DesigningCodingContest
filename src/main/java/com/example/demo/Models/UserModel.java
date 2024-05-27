package com.example.demo.Models;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document (collection="UserData")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserModel extends BaseModel{
    String userName;
    int score;
   // int noOfContest;
    List<ContestModel> contests;
    ContestQuestion contestQuestion;
}
