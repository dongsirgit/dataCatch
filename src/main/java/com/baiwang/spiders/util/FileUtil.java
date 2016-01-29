/**
 *Copyright (c) 1997, 2015,BEST WONDER CO.,LTD. All rights reserved.
 */

package com.baiwang.spiders.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
  * @ClassName: FileUtil
  * @Description: 文件处理工具类
  * @author zhaowei
  * @date 2016年1月29日 上午9:55:15
  */
public class FileUtil {

	 public static String InputStream2String(InputStream in_st,String charset) throws IOException{
	        BufferedReader buff = new BufferedReader(new InputStreamReader(in_st, charset));
	        StringBuffer res = new StringBuffer();
	        String line = "";
	        while((line = buff.readLine()) != null){
	            res.append(line);
	        }
	        return res.toString();
	    }
	 
	 public static String InputStream2File(InputStream in,String filePath){
			FileOutputStream fos = null;
			String fileName =filePath+ File.separator+ System.currentTimeMillis()+".jpg";
			try {
				int flag = 0;
				fos = new FileOutputStream(fileName);
				byte[] b = new byte[1024];
				while((flag = in.read(b,0,1024)) != -1){
					fos.write(b,0,flag);
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				try {
					in.close();
					fos.close();
				} catch (IOException e) {
					
					// TODO Auto-generated catch block
					e.printStackTrace();
					
				}
			}
			
			return fileName;
		}
}
