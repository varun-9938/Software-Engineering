package org.thbs;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class customer {
    private int custid;
    private String cname;
    private address caddress;
}
