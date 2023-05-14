package com.ootcha.wms.service.user;

import com.ootcha.wms.dto.user.UserDto;
import com.ootcha.wms.mapper.user.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{
    private final UserMapper userMapper;
    private final PasswordEncoder passwordEncoder;
    @Override
    public UserDto saveUser(UserDto userDto) {

        String encodingPassword = passwordEncoder.encode(userDto.getPassword());
        userDto.setPassword(encodingPassword);

        userMapper.saveUser(userDto);

        return userDto;
    }
}
