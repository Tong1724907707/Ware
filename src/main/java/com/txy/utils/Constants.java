package com.txy.utils;

public class Constants {
	public final static String USER_SESSION = "userSession";
	public final static String SYS_MESSAGE = "message";
	public final static int pageSize = 5;
	public final static UserStatus ENABLE= UserStatus.enable;
	public final static UserStatus DISABLE= UserStatus.disable;

	public enum UserStatus{
		//代表0或�?1
		enable,disable;
	}
}
