package com.example.conference.model;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class User {
    private final String firstname;
    private final String lastname;
    private final Integer age;
}
