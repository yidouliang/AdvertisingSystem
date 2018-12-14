package com.boot.security.server.utils;

import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPReply;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;

public class FtpUtil {

	private  final static String  FTP_HOST="files.anntly.com";
	private  final static int     FTP_PORT=21;
	private  final static String  USER_NAME="root";
	private  final static String  PASS_WORD="123456";
	private  final static String  BASE_PATH="/";


	/**
	 * Description:     向FTP服务器上传文件
	 * @param filename  上传到FTP服务器上的文件名
	 * @param input     输入流
	 * @return          成功返回true，否则返回false
	 */
	public static boolean uploadFile(String filename, InputStream input) {
		boolean  result=false;
		FTPClient ftp = new FTPClient();
		try {
			int reply;
			ftp.connect(FTP_HOST, FTP_PORT);
			ftp.login(USER_NAME, PASS_WORD);
			reply = ftp.getReplyCode();
			if (!FTPReply.isPositiveCompletion(reply)) {
				ftp.disconnect();
				return false;
			}
			//切换到上传目录
			if (!ftp.changeWorkingDirectory(BASE_PATH))
				ftp.changeWorkingDirectory(BASE_PATH);
			//设置上传文件的类型为二进制类型
			ftp.setFileType(FTP.BINARY_FILE_TYPE);
			//上传文件
			if (!ftp.storeFile(filename, input)) {
				return result;
			}
			input.close();
			ftp.logout();
			result = true;
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (ftp.isConnected()) {
				try {
					ftp.disconnect();
				} catch (IOException ioe) {
					ioe.printStackTrace();
				}
			}
		}
		return result;
	}


	public static  String  getFileName(MultipartFile file){
		String originFileName=file.getOriginalFilename();
		return (new Date().getTime())+originFileName.substring(originFileName.lastIndexOf("."));
	}


	public static String getFilePath(String res){
		return FTP_HOST+File.separator + res;
	}
}