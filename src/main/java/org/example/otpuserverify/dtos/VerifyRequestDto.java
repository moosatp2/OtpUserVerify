package org.example.otpuserverify.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class VerifyRequestDto {

    private String phoneNumber;
    private String otp;
}
