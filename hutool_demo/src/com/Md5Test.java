package com;

import static com.Print.print;

import org.junit.Test;

import cn.hutool.core.codec.Base64;
import cn.hutool.crypto.SecureUtil;

public class Md5Test {
    // @Test
    public void md5() {
        print(SecureUtil.md5("123456"));// e10adc3949ba59abbe56e057f20f883e
        print(SecureUtil.sha1("123456"));// 7c4a8d09ca3762af61e59520943dc26494f8941b
    }

    // @Test
    public void base64() {
        print(Base64.encode("柿子"));// 5p+/5a2Q
        print(Base64.decodeStr("5p+/5a2Q"));// 柿子
    }
}
