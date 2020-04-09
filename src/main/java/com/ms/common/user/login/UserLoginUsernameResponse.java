package com.ms.common.user.login;

import com.ms.common.base.BaseResponse;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserLoginUsernameResponse  extends BaseResponse {
    private String access_token;
    private String refresh_token;
}
