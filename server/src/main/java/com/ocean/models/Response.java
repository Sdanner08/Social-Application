package com.ocean.models;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Response {

    Boolean success;

    String message;

    Object data;

}
