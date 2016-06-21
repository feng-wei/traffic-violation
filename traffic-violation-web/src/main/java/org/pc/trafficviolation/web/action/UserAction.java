package org.pc.trafficviolation.web.action;

import org.apache.commons.lang3.StringUtils;
import org.pc.trafficviolation.service.rmi.UserService;
import org.pc.trafficviolation.service.rmi.request.UserRequest;

public class UserAction extends AbstractActionSupport {
	private static final long serialVersionUID = -7353097405590508349L;

	private UserRequest user;

	private UserService userService;

	private String msg;

	public String register() {
		if (StringUtils.isBlank(user.getUsername()) || StringUtils.isBlank(user.getPassword())) {
			msg = "username or password is invalid, please try again.";
			return INPUT;
		}
		userService.register(user);
		return SUCCESS;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public UserRequest getUser() {
		return user;
	}

	public void setUser(UserRequest user) {
		this.user = user;
	}

	public String getMsg() {
		return msg;
	}

}
