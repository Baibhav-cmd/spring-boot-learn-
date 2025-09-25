package com.example.jparest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.jparest.helper.FileUpload;

@RestController
public class FileuploadController {

	@Autowired
	private FileUpload helper;

	@PostMapping("/upload-file")
	public ResponseEntity<String> uploadFile(@RequestParam("image") MultipartFile file) {
//		System.out.println(file.getOriginalFilename());
//		System.out.println(file.getSize());
//		System.out.println(file.getContentType());
		// file upload code1
		try {
			if (file.isEmpty()) {
				return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("file nbt founf");
			}
			boolean f = helper.uploadfile(file);
			if (f) {
//			return ResponseEntity.ok("file is sucessfully upload");
				return ResponseEntity.ok(ServletUriComponentsBuilder.fromCurrentContextPath().path("/image/")
						.path(file.getOriginalFilename()).toUriString());
			}
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}

		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Somethig went worng");

	}
}
