package com.ms.common.user.token;

import com.ms.common.base.BaseRequest;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;



// 刷新token
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserTokenRefreshRequest  extends BaseRequest {
    private String access_token;
}
