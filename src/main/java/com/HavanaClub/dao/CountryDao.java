package com.HavanaClub.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.HavanaClub.entity.Country;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CountryDao extends JpaRepository<Country, Integer> {

    @Query("select c from Country c left join fetch c.drinks where c.id=:id")
    Country countryWithDrinks(@Param("id") int id);

    @Query("select distinct c from Country c left join fetch c.countryImages")
    List<Country> countriesWithImages();

}
