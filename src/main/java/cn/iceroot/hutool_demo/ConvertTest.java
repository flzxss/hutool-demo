package cn.iceroot.hutool_demo;

import static cn.iceroot.hutool_demo.Print.print;

import org.junit.Test;

import cn.hutool.core.convert.Convert;

public class ConvertTest {
    /***
     * *********************************************************************
     * 万能转换
     * *********************************************************************
     */
    @Test
    public void convert() {
        int num1 = 123;
        Integer num2 = 123;
        long num3 = 123L;
        Long num4 = 123L;
        String str = "123";
        print(Convert.toInt(num1) * 2);// 246
        print(Convert.toInt(num2) * 2);// 246
        print(Convert.toInt(num3) * 2);// 246
        print(Convert.toInt(num4) * 2);// 246
        print(Convert.toInt(str) * 2);// 246
    }
}
