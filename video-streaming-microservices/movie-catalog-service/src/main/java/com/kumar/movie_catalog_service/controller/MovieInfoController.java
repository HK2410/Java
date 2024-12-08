package com.kumar.movie_catalog_service.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kumar.movie_catalog_service.entity.Movie_Info;
import com.kumar.movie_catalog_service.repository.MovieInfoRepository;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class MovieInfoController {
    private MovieInfoRepository movieInfoRepository;
    
    @PostMapping("/movie-info/save")
    public List<Movie_Info> saveAll(@RequestBody List<Movie_Info> movieInfoList){
    	return movieInfoRepository.saveAll(movieInfoList);
    }
    
    @GetMapping("movie-info/list")
    public List<Movie_Info> getAll(){
    	return movieInfoRepository.findAll();
    }
    
    @GetMapping("movie-info/find-path-by-id/{movieInfoId}")
    public String findPathById(@PathVariable Long movieInfoId) {
    	Optional<Movie_Info> movieInfo = movieInfoRepository.findById(movieInfoId);
    	return movieInfo.map(data->data.getPath()).orElseThrow(null);
    }
    
}
