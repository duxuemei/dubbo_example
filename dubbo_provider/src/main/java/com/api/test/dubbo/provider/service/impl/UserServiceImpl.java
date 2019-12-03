package com.api.test.dubbo.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.api.dubbo.service.UserService;
import net.sf.json.JSONObject;
import org.springframework.stereotype.Component;

/**
 * <p>Title:UserServiceImpl</p>
 * <p>Description: </p>
 *
 * @author:duxuemei
 * @date 2019/3/11 14:11
 */
@Component
@Service(version = "1.0.0", timeout = 10000)
public class UserServiceImpl implements UserService {

    @Override
    public String SayHi(String name) {
        return "hi springboot:" + name;
    }

    @Override
    public JSONObject getUser(Integer id) {
        JSONObject jsonObject = new JSONObject();
        /**
         * sudo 查询db。
         */
        JSONObject users = new JSONObject();
        users.put("id", id);
        users.put("userName", "xiaodu");
        users.put("age", 18);
        users.put("address", "北京市海淀区双榆树北路43号");
        jsonObject.put("users", users);
        jsonObject.put("returnCode", 0);
        jsonObject.put("message", "");
        return jsonObject;

    }
}
