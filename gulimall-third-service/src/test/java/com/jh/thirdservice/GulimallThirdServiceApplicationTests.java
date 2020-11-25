package com.jh.thirdservice;

import com.aliyun.oss.OSS;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

@SpringBootTest
class GulimallThirdServiceApplicationTests {
    @Autowired
    private OSS oss;
    @Test
    public void testUpload() throws FileNotFoundException {
        oss.putObject("gulimall-hjhjhj", "1.jpg", new FileInputStream("I:\\我的文件\\图片\\壁纸\\a5c693ca2a2d8746583d16353f45c0b3.jpg"));
        System.out.println("上传成功");
    }
    @Test
    void contextLoads() {
    }

}
