package com.pay.as.user;

import com.pay.as.domain.UserDomain;
import com.pay.as.repository.AuthRepository;
import com.pay.as.repository.PaymentRepository;
import com.pay.as.repository.UserRepository;
import com.pay.as.service.AuthService;
import com.pay.as.service.PaymentService;
import com.pay.as.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class LoginTests {

    @Autowired
    UserRepository userRepository;
    @Autowired
    AuthRepository authRepository;
    @Autowired
    PaymentRepository paymentRepository;

    @Autowired
    UserService userService;
    @Autowired
    AuthService authService;
    @Autowired
    PaymentService paymentService;


    @Test
    public void 로그인() {
        System.out.println(authService.auth("TEST", "PW"));
    }

}
