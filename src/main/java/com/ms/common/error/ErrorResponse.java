package com.ms.common.error;

import com.ms.common.base.IBaseResponse;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ErrorResponse implements IBaseResponse {
    private String error;
}
