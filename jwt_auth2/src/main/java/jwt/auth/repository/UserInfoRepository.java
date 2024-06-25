package jwt.auth.repository;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import jwt.auth.entity.UserInfo;



public interface UserInfoRepository extends JpaRepository<UserInfo, Integer> {
    Optional<UserInfo> findByUname(String username);
}
