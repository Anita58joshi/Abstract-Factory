package com.anita.builder;

import lombok.Builder;
import lombok.ToString;

@Builder
@ToString

public class Child {
    private Long id;
    private String fname;
    private String lname;
}
