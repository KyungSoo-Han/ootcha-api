package com.ootcha.wms.mapper.user;

import com.ootcha.wms.dto.user.UserDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.Optional;

@Mapper
public interface UserMapper {
    Optional<UserDto> findById(String id);
    void saveUser(UserDto userDto);
}
