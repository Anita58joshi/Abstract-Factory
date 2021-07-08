package com.anita.daily.serializationdeserialization;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Staff implements Serializable {
    private Long id;
    private String name;
    private String departmentName;


}
