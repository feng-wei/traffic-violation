package org.pc.trafficviolation.dao.impl;

import org.pc.trafficviolation.dao.UserDao;
import org.pc.trafficviolation.model.User;
import org.springframework.data.mongodb.core.MongoTemplate;

public class UserDaoImpl implements UserDao {

	private MongoTemplate mongoTemplate;

	public void save(User user) {
		mongoTemplate.save(user);
	}

	public void setMongoTemplate(MongoTemplate mongoTemplate) {
		this.mongoTemplate = mongoTemplate;
	}

}
