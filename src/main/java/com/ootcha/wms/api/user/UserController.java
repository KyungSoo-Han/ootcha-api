package com.ootcha.wms.api.user;

import com.ootcha.wms.config.jwt.JwtFilter;
import com.ootcha.wms.config.jwt.TokenProvider;
import com.ootcha.wms.dto.common.ResponseDto;
import com.ootcha.wms.dto.user.LoginDto;
import com.ootcha.wms.dto.user.UserDto;
import com.ootcha.wms.service.user.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/user")
public class UserController {

    private final TokenProvider tokenProvider;
    private final AuthenticationManagerBuilder authenticationManagerBuilder;
    private final UserService userService;

    @PostMapping("/login")
    public ResponseDto<Map> Login(@RequestBody LoginDto request){

        UsernamePasswordAuthenticationToken authenticationToken =
                new UsernamePasswordAuthenticationToken(request.getId(), request.getPassword());
        System.out.println("authenticationToken = " + authenticationToken);

        Authentication authentication = authenticationManagerBuilder.getObject().authenticate(authenticationToken);
        SecurityContextHolder.getContext().setAuthentication(authentication);

        System.out.println(authentication.getPrincipal());
        User user = (User) authentication.getPrincipal();

        String jwt = tokenProvider.createToken(authentication);
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add(JwtFilter.AUTHORIZATION_HEADER, "Bearer " + jwt);

        Map<String, Object> map = new HashMap<>();
        map.put("token", jwt);
        map.put("username", user.getUsername());

        return ResponseDto.SuccessResponse(map, HttpStatus.OK);
    }
    @PostMapping
    public ResponseDto<UserDto> saveUser(@RequestBody UserDto userDto){

        UserDto user = userService.saveUser(userDto);

        return ResponseDto.SuccessResponse(user, HttpStatus.OK);
    }
}
