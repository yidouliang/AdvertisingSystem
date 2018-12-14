package com.boot.security.server.controller;

import com.boot.security.server.dto.ResponseData;
import com.boot.security.server.dto.ResponseInfo;
import com.boot.security.server.utils.FtpUtil;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;


/**
 * FTP 文件上传
 */
@CrossOrigin
@RestController
public class FtpFileUploadController {

    //ftp处理文件上传
    @RequestMapping("/upload")
    public ResponseData<String> ftpUploadFile(@RequestParam("ftpFile")MultipartFile ftpFile){
        String  res= FtpUtil.getFileName(ftpFile);
        boolean  b=false;
        try {
            b =FtpUtil.uploadFile(res,ftpFile.getInputStream());
            System.out.println("res==="+res+" 走了Ftp上传,"+(b?"上传成功":"上传失败"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return ResponseData.success(FtpUtil.getFilePath(res));
    }


}


