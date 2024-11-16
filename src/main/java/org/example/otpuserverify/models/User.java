package org.example.otpuserverify.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class User extends BaseModel {

    private String username;
    private String phoneNumber;
//    private String hashedPassword;
    private boolean isVerified;
}
