package com.sahan.cohort5.dao;

import com.sahan.cohort5.model.Mobile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MobileRepository extends JpaRepository<Mobile,Integer> {
}
