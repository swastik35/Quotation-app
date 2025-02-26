package com.swastik.QuotationsGen;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Quotes {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @JsonProperty("id")
        @Column(name = "id")
        private Integer id;
        @JsonProperty("quote")
        @Column(name = "quote")
        private String quote;
        @JsonProperty("author")
        @Column(name = "author")
        private String author;
        @JsonProperty("category")
        @Column(name = "category")
        private String category;


}
