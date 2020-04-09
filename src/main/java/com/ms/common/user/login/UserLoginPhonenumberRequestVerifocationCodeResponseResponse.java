package com.ms.common.user.login;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserLoginPhonenumberRequestVerifocationCodeResponseResponse  {
    private String verifocation_code;
}
