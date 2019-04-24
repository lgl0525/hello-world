package com.qf.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.ClassUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.qf.util.FileUtil;
import com.qf.vo.MsgResult;


@Controller
public class upload {

	@RequestMapping(value="/fileUpload",method=RequestMethod.POST)
	@ResponseBody
    public MsgResult fileUpload (@RequestParam("file") MultipartFile file) throws IOException {
	MsgResult msg=new MsgResult();
	if(file!=null){
	long startTime=System.currentTimeMillis();
	System.out.println("fileName："+file.getOriginalFilename());
	String path=ClassUtils.getDefaultClassLoader().getResource("").getPath()+"static/html/img/";
	String fileName = file.getOriginalFilename();
	try {
		// 该方法是对文件写入的封装，在util类中，导入该包即可使用，后面会给出方法				
		FileUtil.fileupload(file.getBytes(), path, fileName);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println(path);
	String s="../img/"+fileName;
	System.out.println(s);
	long endTime=System.currentTimeMillis();
    System.out.println("运行时间："+String.valueOf(endTime-startTime)+"ms");
    msg.setStatus(200);
    msg.setMessage(s);
	return msg;
	}
	return msg; 
	}
	
	@RequestMapping("/testDownload")
	public ResponseEntity<byte[]> download() throws IOException {
	    //创建文件
	    File file = new File("E://a.txt");
	    byte[] body = null;
	    //创建输入流(从硬盘读取数据)
	    InputStream is = new FileInputStream(file);
	    //创建字节数组并指定长度
	    body = new byte[is.available()];
	    //将数据从输入流导到输出流
	    is.read(body);
	    //创建请求头并设置指定值
	    HttpHeaders headers = new HttpHeaders();
	    headers.add("Content-Disposition", "attchement;filename=" + file.getName());
	    //设置HTTP响应状态。
	    HttpStatus statusCode = HttpStatus.OK;
	    //创建响应实体对象
	    ResponseEntity<byte[]> entity = new ResponseEntity<byte[]>(body, headers, statusCode);
	    return entity;
	}
}
