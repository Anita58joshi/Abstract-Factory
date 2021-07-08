package com.anita.daily.facade.v2.FacadeDemo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.io.Serializable;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class Job implements Serializable {
    private Long id;
    private String title;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("job_details")
    private String jobDetails;
    private Apply apply;
    @JsonProperty("apply_button_option")
    private String applyButtonOption;
    private Company company;


    @ToString
    @NoArgsConstructor
    @AllArgsConstructor
    @Getter
    @Setter


    public static class Apply implements Serializable{
        private Boolean status;
    }

    @NoArgsConstructor
    @AllArgsConstructor
    @Getter
    @Setter
    @ToString
    public static class Company implements Serializable{
        private Long id;
        private String name;
        private String url;
        @JsonProperty("profile_picture")
        private Long profilePicture;
        @JsonProperty("cover_picture")
        private Long coverPicture;
    }



}
