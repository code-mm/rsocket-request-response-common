package com.ms.common.user.token;


import com.ms.common.base.BaseResponse;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


// 检查token
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserTokenCheckResponse  implements BaseResponse {
    private Boolean expired;
}
