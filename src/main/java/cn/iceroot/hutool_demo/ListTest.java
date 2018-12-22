package cn.iceroot.hutool_demo;

import static cn.iceroot.hutool_demo.Print.print;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import cn.hutool.core.collection.CollUtil;

public class ListTest {
    @Test
    public void isEmpty() {
        List<String> list = new ArrayList<String>();
        List<String> nullList = null;
        print(CollUtil.isEmpty(nullList));// true
        print(CollUtil.isEmpty(list));// true
        list.add("aaa");
        print(CollUtil.isEmpty(list));// false
    }

    @Test
    public void distinct() {
        List<String> list = new ArrayList<String>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("aaa");
        list.add("bbb");
        print(list);// [aaa, bbb, ccc, aaa, bbb]
        List<String> list2 = CollUtil.distinct(list);
        print(list2);// [aaa, bbb, ccc]
    }
}
