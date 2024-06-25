package jwt.auth.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import jwt.auth.entity.UserInfo;
import jwt.auth.repository.UserInfoRepository;


@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserInfoRepository userInfoRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

	@Override
	public String addUser(UserInfo userInfo) {
		userInfo.setPwd(passwordEncoder.encode(userInfo.getPwd()));
		 userInfoRepository.save(userInfo);
		
		return "User added successfully" ;
	}
}
