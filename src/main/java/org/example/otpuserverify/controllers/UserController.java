package org.example.otpuserverify.controllers;


import org.example.otpuserverify.dtos.SignInRequestDto;
import org.example.otpuserverify.dtos.VerifyRequestDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @PostMapping("/signin")
    private ResponseEntity<String> signIn(@RequestBody SignInRequestDto signInRequestDto){

        return null;
    }

    @PostMapping("/verify")
    private String verify(@RequestBody VerifyRequestDto verifyRequestDto ){
        return null;
    }
}
