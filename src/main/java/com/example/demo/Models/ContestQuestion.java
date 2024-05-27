package com.example.demo.Models;

import lombok.*;

import java.util.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ContestQuestion {
    List<Long> questionsList=new LinkedList<>();
}
