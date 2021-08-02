package com.example.demo.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Data
@ToString
@Entity
@NoArgsConstructor
@Table
public class JsonMessage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String message_key;
    private String message_value;

    public JsonMessage(String message_key, String message_value) {
        this.message_key = message_key;
        this.message_value = message_value;
    }
}
