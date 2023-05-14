package com.ootcha.wms.service.user;


import com.ootcha.wms.dto.user.UserDto;
import com.ootcha.wms.mapper.user.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Component("userDetailsService")
public class CustomUserDetailService implements UserDetailsService {
    private final UserMapper userMapper;

    @Override
    public UserDetails loadUserByUsername(final String id) throws UsernameNotFoundException {
        Optional<UserDto> userDto = userMapper.findById(id);

        if(!userDto.isPresent())
            throw new UsernameNotFoundException("존재하지 않는 아이디입니다.");

        User user =   makeUserObj(userDto.get());

        return user;
    }

    private User makeUserObj(UserDto userDto) {

        String Role = userDto.getRole().toString();

        List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
        authorities.add(new SimpleGrantedAuthority(Role));

        User user = new User(userDto.getId(), userDto.getPassword(), authorities);
        System.out.println("makeUserObj user = " + user);

        return user;
    }
}
