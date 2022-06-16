package com.example.restapisearch.input;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductInput {
    // input fields
    private String name;
    private String description;
    private boolean active;
}
