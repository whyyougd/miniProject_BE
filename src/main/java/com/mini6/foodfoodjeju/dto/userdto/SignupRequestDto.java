package com.mini6.foodfoodjeju.dto.userdto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class SignupRequestDto {
    private String userName;
    private String password;
    private String passwordCheck;
//    private String nickname;
    private String email;
    private boolean admin = false;
    private String adminToken = "";
}