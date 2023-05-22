package com.tpe.repository;

import com.tpe.domain.Film;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

@Repository
public interface FilmRepository extends JpaRepository<Film,Integer> {

    @Procedure(procedureName = "getCount")
    String getFilmCount();
}
