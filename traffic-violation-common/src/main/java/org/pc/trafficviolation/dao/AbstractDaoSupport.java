package org.pc.trafficviolation.dao;

public interface AbstractDaoSupport<T> {

	void save(Class<T> clazz);

}
