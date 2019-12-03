package com.api.dubbo.service;

import net.sf.json.JSONObject;

/**
 * <p>Title:UserService</p>
 * <p>Description: </p>
 *
 * @author:duxuemei
 * @date 2019/3/11 13:51
 */
public interface UserService {
    public String SayHi(String name);

    public JSONObject getUser(Integer id);
}
