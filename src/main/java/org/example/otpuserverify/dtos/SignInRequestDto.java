package org.example.otpuserverify.dtos;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SignInRequestDto {
    private String username;
    private String phoneNumber;
}
