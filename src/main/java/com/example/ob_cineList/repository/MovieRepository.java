package com.example.ob_cineList.repository;

import com.example.ob_cineList.entities.Movies;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends JpaRepository<Movies,Long> {
}
