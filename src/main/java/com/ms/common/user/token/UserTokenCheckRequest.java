package com.ms.common.user.token;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


// 检查token
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserTokenCheckRequest {


    private String token;

}
