package com.example.history_table_proof_of_concept;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.UUID;

@Repository
interface TestRepoBasket extends CrudRepository<Basket, UUID> {

    @Modifying
    @Transactional
    @Query(value = "INSERT INTO basket (id, count) VALUES (1392, 900) ", nativeQuery = true)
    void insertBasket();
}
