package org.thbs;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Customer {
    private int custid;
    private String cname;
    private Address address;

    public Customer(Address address) {
        this.address = address;
    }
}
