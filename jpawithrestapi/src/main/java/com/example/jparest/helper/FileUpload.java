package com.example.jparest.helper;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Component
public class FileUpload {
//	public final String Upload_dir = "D:\\spring boot\\jpawithrestapi\\src\\main\\resources\\static\\image";
	public final String Upload_dir = new ClassPathResource("static/image/").getFile().getAbsolutePath();

	public FileUpload()throws IOException
	{
		
		 
	}
	public boolean uploadfile(MultipartFile dataFile) {
		boolean f = false;
		try {
			InputStream is = dataFile.getInputStream();
			byte data[] = new byte[is.available()];
			is.read(data);
			
			FileOutputStream fos=new FileOutputStream(Upload_dir+"\\"+dataFile.getOriginalFilename());
			fos.write(data);
			fos.close();
			f=true;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
	}

}
