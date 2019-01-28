package com.pay.as.repository;

import com.pay.as.domain.UserDomain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserDomain, Long> {

    UserDomain findByIdentifyAndPassword(String identify, String password);

}
