package com.kumar.movie_catalog_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kumar.movie_catalog_service.entity.Movie_Info;

@Repository
public interface MovieInfoRepository extends JpaRepository<Movie_Info,Long>{

}
