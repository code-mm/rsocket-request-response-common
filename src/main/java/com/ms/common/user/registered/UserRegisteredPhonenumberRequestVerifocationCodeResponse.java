package com.ms.common.user.registered;


import com.ms.common.base.BaseResponse;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserRegisteredPhonenumberRequestVerifocationCodeResponse  implements BaseResponse {
    private String verifocation_code;
}
