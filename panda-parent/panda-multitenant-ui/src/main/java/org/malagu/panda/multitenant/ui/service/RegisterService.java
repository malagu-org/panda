package org.malagu.panda.multitenant.ui.service;

import org.malagu.multitenant.domain.Organization;
import org.malagu.panda.security.orm.User;

/**
 * @author Kevin Yang (mailto:kevin.yang@bstek.com)
 * @since 2016年8月15日
 */
public interface RegisterService {

	boolean isExistOrganization(String organizationId);

	boolean isExistUser(String organizationId, String username);

	void registerOrganization(User user);

	void registerUser(User user);

	Organization getOrganization(String organizationId);
}
