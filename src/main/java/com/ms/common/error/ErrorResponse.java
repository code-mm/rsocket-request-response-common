package com.ms.common.error;

import com.ms.common.base.BaseResponse;
import lombok.Data;

@Data
public class ErrorResponse extends BaseResponse {

    private String error;

}
