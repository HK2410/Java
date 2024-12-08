package com.kumar.movie_streaming_service.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieStreamController {
    public static final String VIDEO_DIRECTORY="/home/hemakumar/Desktop/";
    
    @Autowired
    private MovieCatalogService catalogService;
    
	@GetMapping("/stream/{videoPath}")
	public ResponseEntity<InputStreamResource> streamVideo(@PathVariable String videoPath) throws FileNotFoundException{
		System.out.println("inside connn");
		File file = new File(VIDEO_DIRECTORY+videoPath);
		System.out.println(VIDEO_DIRECTORY+videoPath);
		System.out.println(file.exists());
		if(file.exists()) {
			InputStreamResource inputStreamResource = 
					  new InputStreamResource(new FileInputStream(file));
			return ResponseEntity.ok()
					.contentType(MediaType
					.parseMediaType("video/mp4")).body(inputStreamResource);
		}
		else {
			return ResponseEntity.notFound().build();
		}
	}
	
	@GetMapping("/stream/id/{videoInfoId}")
	public ResponseEntity<InputStreamResource> streamVideoById(@PathVariable Long videoInfoId) throws FileNotFoundException{
	   System.out.println("inside id stream"+videoInfoId);
		String moviePath = catalogService.getMoviePath(videoInfoId);
		System.out.println("moviePath"+moviePath);
		return streamVideo(moviePath);
	}
} 
