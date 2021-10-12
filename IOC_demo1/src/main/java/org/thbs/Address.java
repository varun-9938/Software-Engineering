package org.thbs;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Address {
    private String doorno;
    private String street;
    private String city;
    private String state;
    private String pin;


}
