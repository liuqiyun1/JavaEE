package com.zut.ioc;

public class UserDaoImpl implements UserDao {

	@Override
	public void say() {
		System.out.println("UserDao says hello world!");
	}

}
