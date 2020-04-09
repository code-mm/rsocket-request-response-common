package com.ms.common.error;

import com.ms.common.base.BaseResponse;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ErrorResponse implements BaseResponse {
    private String error;
}
