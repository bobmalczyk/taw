package com.example.demo4;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;
@Data //automatycznie tworzy getter & setter
@JsonSerialize

public class Course {
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("nazwa")
    private String name;
    @JsonProperty("ects")
    private Integer ects;
    @JsonProperty("sala")
    private Integer sala;
    @JsonProperty("egzamin")
    private String egzamin;
}
