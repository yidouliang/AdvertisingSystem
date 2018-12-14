package com.boot.security.server.test;

import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FtpTest {

    @Test
    public void testFtpClient() throws IOException {
        FTPClient ftpClient = new FTPClient();
        ftpClient.connect("192.168.25.129",21);//服务器地址和端口
        ftpClient.login("fileuser","123456");//登录的用户名和密码
        //读取本地文件，给出的是本地文件地址
        FileInputStream inputStream = new FileInputStream(new File("G:/test.txt"));
        //设置上传路径
        ftpClient.changeWorkingDirectory("filedir");
        //设置文件类型
        ftpClient.setFileType(FTP.BINARY_FILE_TYPE);
        //1.服务器端保存的文件名，2.上传文件的inputstream
        ftpClient.storeFile("test1.txt",inputStream);
        ftpClient.logout();
    }
}
