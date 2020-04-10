package com.ms.common.user.login;

import com.ms.common.base.BaseRequest;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserLoginPhonenumberRequest  extends BaseRequest {

    private String phone_number;
    private String verification_code;

}
