package com.example.history_table_proof_of_concept;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
interface TestRepo extends CrudRepository<Fruit, UUID> {

    @Query(value = "INSERT INTO fruit (id, name, color, basket_id) VALUES (20,'test fruit name3', 'test color3', 20) ", nativeQuery = true)
    void insertFruit();

    @Query(value = "UPDATE fruit SET name = 'test 6000' where id = 7", nativeQuery = true)
    void updateFruit();

    @Query(value = "select * from fruit", nativeQuery = true)
    List<Fruit> getFruit();
}
