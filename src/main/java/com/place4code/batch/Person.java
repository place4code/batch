package com.place4code.batch;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
Business Class
Java >= 14: kann als RECORD class
*/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {

    private String lastName;
    private String firstName;

}