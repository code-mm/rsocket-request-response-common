package com.ms.common.user.login;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserLoginPhonenumberResponse   {

    private String access_token;
    private String refresh_token;

}
