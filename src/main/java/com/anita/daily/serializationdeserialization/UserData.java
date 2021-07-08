package com.anita.daily.serializationdeserialization;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@Builder
@ToString

public class UserData implements Serializable {
    private String username;
    private Long highScore;
    private Integer totalGamePlayed;
    private Integer level;

}
