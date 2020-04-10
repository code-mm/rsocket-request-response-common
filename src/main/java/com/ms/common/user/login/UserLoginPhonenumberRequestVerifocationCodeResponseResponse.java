package com.ms.common.user.login;


import com.ms.common.base.BaseResponse;
import com.ms.common.base.IBaseResponse;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserLoginPhonenumberRequestVerifocationCodeResponseResponse  extends BaseResponse {
    private String verifocation_code;
}
