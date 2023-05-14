package com.ootcha.wms.api.common;

import com.ootcha.wms.config.CustomException;
import com.ootcha.wms.dto.common.ExceptionResponseDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice(annotations = {RestController.class, Service.class})
public class ControllerAdvisor {
    private static final Logger logger = LoggerFactory.getLogger(ControllerAdvisor.class);
    @ExceptionHandler(Exception.class)
    protected ResponseEntity<ExceptionResponseDto> handleAll(final Exception e) {
        logger.error("error", e);

        ExceptionResponseDto responseVo = ExceptionResponseDto.builder()
                .error("ERROR")
                .message("서버오류가 발생했습니다.")
                .build();

        return new ResponseEntity<>(responseVo, HttpStatus.INTERNAL_SERVER_ERROR);
    }


    /**
     * Controller 전범위 Exception (임시) //각 Exception 과 메시지 정의 필요
     */
    @ExceptionHandler(CustomException.class)
    protected ResponseEntity<ExceptionResponseDto> customException(final Exception e) {
        logger.error("error", e);

        ExceptionResponseDto responseVo = ExceptionResponseDto.builder()
                .error("ERROR")
                .message(e.getMessage())
                .build();

        return new ResponseEntity<>(responseVo, HttpStatus.OK);
    }


    @ExceptionHandler(UsernameNotFoundException.class)
    protected ResponseEntity<ExceptionResponseDto> usernameNotFoundException(final UsernameNotFoundException e) {
        logger.error("error", e);

        ExceptionResponseDto responseVo = ExceptionResponseDto.builder()
                .error("ERROR")
                .message(e.getMessage())
                .build();

        return new ResponseEntity<>(responseVo, HttpStatus.OK);
    }
}
