package com.ocean.models;

import lombok.*;
/*
 *    @author
 *      Front End:
 *        -Angel Walker
 *       -Trevor Drury
 *       Back End:
 *        -David Burton
 *        -Shane Danner
 */
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
