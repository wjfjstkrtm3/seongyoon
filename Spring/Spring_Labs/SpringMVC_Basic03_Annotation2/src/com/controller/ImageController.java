package com.controller;

import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.model.Photo;

@Controller
@RequestMapping("/image/upload.do")
public class ImageController {
	
	
	@RequestMapping(method=RequestMethod.GET) 
	public String form() {
		System.out.println("image.jsp forward");
		
		return "image/image";
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String submit(Photo photo, HttpServletRequest request) throws IOException {
		CommonsMultipartFile imagefile = photo.getFile();
		System.out.println(imagefile.getName());
		System.out.println(imagefile.getBytes().length);
		System.out.println(imagefile.getOriginalFilename());
		
		photo.setImage(imagefile.getName());
		
		String filename = imagefile.getOriginalFilename();
		String path = request.getServletContext().getRealPath("/upload");
		
		String fpath = path + "\\" + filename;
		
		FileOutputStream fs = new FileOutputStream(fpath);
		fs.write(imagefile.getBytes());
		fs.close();
		return "image/image";
	}
	
	
	
}
