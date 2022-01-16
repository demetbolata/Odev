package com.example.odev.repositories;

import com.example.odev.entities.CoinEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CoinRepository extends JpaRepository<CoinEntity, Long> {

    List<CoinEntity> findByIsim(String isim);
}
