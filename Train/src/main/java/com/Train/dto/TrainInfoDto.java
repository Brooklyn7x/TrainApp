package com.Train.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class TrainInfoDto {

    @JsonProperty("trainNo")
    int trainNo;

}
