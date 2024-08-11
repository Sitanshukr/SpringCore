package com.spring.core.services;

import com.spring.core.Interface.MessageService;

public class TwitterService implements MessageService{

	@Override
	public boolean sendMessage(String msg, String rec) {
		// TODO Auto-generated method stub
		System.out.println("Hi From Twittter Service---"+ msg+ "   " +rec);
		return true;
	}

}
