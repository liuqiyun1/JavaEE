package com.zut.ioc;

public class UserServiceImpl implements UserService {
	
	public UserDao user;
	public void setUserDao(UserDao user) {
		this.user = user;
	}
	@Override
	public void say() {
		this.user.say();
		System.out.println("UserService says hello world!");

	}

}
