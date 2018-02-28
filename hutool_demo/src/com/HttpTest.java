package com;

import org.junit.Test;

import cn.hutool.http.HttpUtil;

public class HttpTest {
    @Test
    public void isEmpty() {
        String url = "http://www.baidu.com";
        String result = HttpUtil.get(url);
        System.out.println(result);
    }
}
