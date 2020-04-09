package com.ms.common.user;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {

    private String userid;
    private String avatar;
    private String name;
    private String sex;
    private String age;



}
