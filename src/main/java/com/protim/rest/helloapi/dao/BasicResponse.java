package com.protim.rest.helloapi.dao;


import lombok.Builder;
import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@Builder
@AllArgsConstructor
public class BasicResponse {
    String id;
    String message;
}
