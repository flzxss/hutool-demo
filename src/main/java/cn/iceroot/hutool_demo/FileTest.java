package cn.iceroot.hutool_demo;

import static cn.iceroot.hutool_demo.Print.print;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.junit.Test;

import cn.hutool.core.io.FileUtil;

public class FileTest {
    @Test
    public void isEmpty() {
        String basePath = null;
        try {
            basePath = new File(".").getCanonicalPath().replace("\\", "/");
        } catch (IOException e) {
            e.printStackTrace();
        }
        String fileName = basePath + "/src/demo.txt";
        List<String> readUtf8Lines = FileUtil.readUtf8Lines(fileName);
        print(readUtf8Lines);
        String content = FileUtil.readUtf8String(fileName);
        print(content);
        fileName = "C:/Users/Administrator/Desktop/content.txt";
        String contentNew = "测试文件";
        FileUtil.writeUtf8String(contentNew, fileName);
    }
}
