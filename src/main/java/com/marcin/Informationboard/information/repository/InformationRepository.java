package com.marcin.Informationboard.information.repository;

import com.marcin.Informationboard.information.model.Information;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InformationRepository extends JpaRepository<Information, Integer> {
}
