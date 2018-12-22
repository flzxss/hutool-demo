package cn.iceroot.hutool_demo;

import org.junit.Test;

import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;

import cn.iceroot.hutool_demo.pojo.User;

public class JSONTest {
    @Test
    public void formatJsonStr() {
        String str = "{\"username\":\"zhangsan\",\"password\":\"123\",\"age\":18}";
        String result = JSONUtil.formatJsonStr(str);
        System.out.println(result);
    }

    @Test
    public void toBean() {
        String str = "{\"username\":\"zhangsan\",\"password\":\"123\",\"age\":18}";
        User user = JSONUtil.toBean(str, User.class);
        System.out.println(user);
    }

    @Test
    public void parseObj() {
        User user = new User();
        user.setUsername("lisi");
        user.setPassword("test");
        user.setAge(15);
        JSONObject jsonObject = JSONUtil.parseObj(user);
        String str = jsonObject.toString();
        System.out.println(str);
    }
}
