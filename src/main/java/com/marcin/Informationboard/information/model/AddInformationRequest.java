package com.marcin.Informationboard.information.model;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class AddInformationRequest {

    @NotNull
    private String content;
}
