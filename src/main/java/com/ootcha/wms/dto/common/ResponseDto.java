package com.ootcha.wms.dto.common;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

@Data
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ResponseDto<T> {

    private HttpStatus status = HttpStatus.OK;
    private String message;
    private T data;

    public static <T> ResponseDto<T> SuccessResponse(T data, HttpStatus status) {
        return new ResponseDto<>(data, status );
    }

    @Builder
    public ResponseDto(T data, HttpStatus status ) {
        this.status = status;
        this.data = data;
    }

}
