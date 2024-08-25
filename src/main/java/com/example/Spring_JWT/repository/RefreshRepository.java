package com.example.Spring_JWT.repository;

import com.example.Spring_JWT.Entity.RefreshToken;
import org.apache.el.parser.BooleanNode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

public interface RefreshRepository extends JpaRepository<RefreshToken, Long> {

    Boolean existsByRefresh(String refresh);

    @Transactional
    void deleteByRefresh(String refresh);

}
