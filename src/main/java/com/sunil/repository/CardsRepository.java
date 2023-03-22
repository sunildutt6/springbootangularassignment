package com.sunil.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sunil.entity.Cards;

@Repository
public interface CardsRepository extends JpaRepository<Cards, Long> {

	List<Cards> findByCustomerId(int customerId);
}
