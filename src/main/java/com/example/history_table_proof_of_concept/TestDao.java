package com.example.history_table_proof_of_concept;

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class TestDao {
    private final NamedParameterJdbcTemplate jdbcTemplate;

    public TestDao(NamedParameterJdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    private static final String TEST_SQL =
            " insert into fruit (id, name, color) values (1112,'test fruit name2', 'test color2') ";

    public void insertRecordTest() {
        MapSqlParameterSource mapSqlParameterSource = new MapSqlParameterSource();
        jdbcTemplate.update(TEST_SQL, mapSqlParameterSource);
    }
}
