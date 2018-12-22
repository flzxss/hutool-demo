package cn.iceroot.hutool_demo;

import cn.hutool.core.util.StrUtil;
import static cn.iceroot.hutool_demo.Print.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class StrUtilTest {
    /***
     * *********************************************************************
     * 判断空值
     * *********************************************************************
     */
    // @Test
    public void isEmpty() {
        print(StrUtil.isEmpty(null));// true
        print(StrUtil.isEmpty(""));// true
        print(StrUtil.isEmpty(" "));// false
        print(StrUtil.isEmpty("abc"));// false
    }

    // @Test
    public void isBlank() {
        print(StrUtil.isBlank(null));// true
        print(StrUtil.isBlank(""));// true
        print(StrUtil.isBlank(" "));// true
        print(StrUtil.isBlank("abc"));// false
    }

    // @Test
    public void isNotEmpty() {
        print(StrUtil.isNotEmpty(null));// false
        print(StrUtil.isNotEmpty(""));// false
        print(StrUtil.isNotEmpty(" "));// true
        print(StrUtil.isNotEmpty("abc"));// true
    }

    // @Test
    public void isNotBlank() {
        print(StrUtil.isNotBlank(null));// false
        print(StrUtil.isNotBlank(""));// false
        print(StrUtil.isNotBlank(" "));// false
        print(StrUtil.isNotBlank("abc"));// true
    }

    /***
     * *********************************************************************
     * 字符串切割
     * *********************************************************************
     */
    // @Test
    public void subBefore() {
        print(StrUtil.subBefore("abcdefghijkldefmnopqrstuvwxyz", "def", false));// abc
        print(StrUtil.subBefore("abcdefghijkldefmnopqrstuvwxyz", "def", true));// abcdefghijkl
        print(StrUtil.subAfter("abcdefghijkldefmnopqrstuvwxyz", "def", false));// ghijkldefmnopqrstuvwxyz
        print(StrUtil.subAfter("abcdefghijkldefmnopqrstuvwxyz", "def", true));// mnopqrstuvwxyz
        print(StrUtil.subBetween("abcdef<ghi>jklmnopq", "<", ">"));// ghi
    }

    // @Test
    public void removePrefix() {
        print(StrUtil.removePrefix("abcdefghijklmn", "abc"));// defghijklmn
        print(StrUtil.removeSuffix("abcdefghijklmn", "lmn"));// abcdefghijk
    }

    /***
     * *********************************************************************
     * 字符串分隔与聚合
     * *********************************************************************
     */
    // @Test
    public void splitTrim() {
        print(StrUtil.splitTrim("abc  ,  def  ,  ghijklmnopq", ","));// [abc,
                                                                     // def,
                                                                     // ghijklmnopq]
        List<String> list = new ArrayList<String>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        print(StrUtil.join("=", list));// aaa=bbb=ccc
    }
}
