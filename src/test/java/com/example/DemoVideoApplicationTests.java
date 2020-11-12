package com.example;

import com.example.mapper.user.UserMapper;
import com.github.tobato.fastdfs.domain.fdfs.StorePath;
import com.github.tobato.fastdfs.service.FastFileStorageClient;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

@SpringBootTest
class DemoVideoApplicationTests {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private FastFileStorageClient storageClient;

    @Test
    void contextLoads() throws FileNotFoundException {
        File file = new File("C:\\Huawei Share\\OneHop\\测试.mp4");
        FileInputStream fileInputStream = new FileInputStream(file);
        StorePath storePath = storageClient.uploadFile(fileInputStream, file.length(), "mp4", null);
        System.out.println(storePath.getFullPath());
        String s = "http://101.201.255.155:8888/group1/M00/00/00/rBb8qV-sueeABi1pAaTKfcgHFEQ489.mp4";
    }

}
