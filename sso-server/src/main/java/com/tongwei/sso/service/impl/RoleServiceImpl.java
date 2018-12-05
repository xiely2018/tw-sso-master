package com.tongwei.sso.service.impl;

import org.springframework.stereotype.Service;

import com.tongwei.auth.model.Role;
import com.tongwei.common.dao.CmServiceImpl;
import com.tongwei.sso.service.IRoleService;

/**
 * @author yangz
 * @date 2018年1月17日 下午3:16:59
 */
@Service
public class RoleServiceImpl extends CmServiceImpl<Role, Integer> implements IRoleService {

}
