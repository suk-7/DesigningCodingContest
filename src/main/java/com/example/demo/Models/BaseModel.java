package com.example.demo.Models;

import lombok.Getter;
import lombok.ToString;
import org.springframework.data.annotation.Id;

import java.io.Serializable;

@Getter
@ToString

public class BaseModel implements Serializable {

    @Id
    Long id;
}
