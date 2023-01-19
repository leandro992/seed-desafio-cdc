package com.deveficiente.repository;

import com.deveficiente.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepositoy extends JpaRepository<Country, Long> {
}
