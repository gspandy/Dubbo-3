package org.springframe.system.service;

import java.io.Serializable;

import org.springframe.system.model.SystemUser;

public interface SystemUserService {
	/**
	 * 根据用户名查询返回对象
	 * @param username
	 * @return
	 */
	public SystemUser loadByUsername(String username);
	
	/**
	 * 新增
	 * @param systemUser
	 * @return
	 */
	public Serializable save(SystemUser systemUser);
}
