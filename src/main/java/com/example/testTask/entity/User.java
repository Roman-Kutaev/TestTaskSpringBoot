package com.example.testTask.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class User {
    @NonNull
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private int id;
    private String fio = "Test Testov";
}
