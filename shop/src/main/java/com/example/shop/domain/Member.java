package com.example.shop.domain;

import lombok.*;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Member {
    private String name;
    private String id;
    private String password;
    private String email;
    private String phone;

    // 롬복을 사용하면 Getter, Setter 사용하지 않아도 괜찮음
}
