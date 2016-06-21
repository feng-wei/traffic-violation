package org.pc.trafficviolation.service.rmi;

import org.pc.trafficviolation.service.rmi.request.UserRequest;

public interface UserService {

	void register(UserRequest user);

}