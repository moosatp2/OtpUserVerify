package org.example.otpuserverify.repositories;

import org.example.otpuserverify.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

    User findUserByPhoneNumber(String phoneNumber);
}
