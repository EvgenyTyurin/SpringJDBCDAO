package evgenyt.springdemo;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**
 * DAO for connect Person class with person db table
 */

public class PersonDAO extends JdbcDaoSupport{

    // Insert new person
    public void insert(Person person) {
        getJdbcTemplate().update(
                "INSERT INTO person(person_name) VALUES (?)",
                new Object[] {person.getName()}
        );
    }
}
