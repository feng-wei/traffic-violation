package org.pc.trafficviolation.service.rmi.impl;

import org.pc.trafficviolation.dao.UserDao;
import org.pc.trafficviolation.model.User;
import org.pc.trafficviolation.service.rmi.UserService;
import org.pc.trafficviolation.service.rmi.request.UserRequest;
import org.springframework.beans.BeanUtils;

public class UserServiceImpl implements UserService {

	private UserDao userDao;

	@Override
	public void register(UserRequest userRequest) {
		User user = new User();
		BeanUtils.copyProperties(userRequest, user);
		userDao.save(user);
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

}
