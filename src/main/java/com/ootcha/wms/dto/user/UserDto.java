package com.ootcha.wms.dto.user;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class UserDto {
    private String bizCd;
    private String id;
    private String name;
    private String password;
    private String email;
    private String role;
    private String phoneNo;
    private LocalDateTime createdDt;

}
