package com.swastik.QuotationsGen.Dao;

import com.swastik.QuotationsGen.Quotes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface QuotesDAO extends JpaRepository<Quotes, Integer> {
}
