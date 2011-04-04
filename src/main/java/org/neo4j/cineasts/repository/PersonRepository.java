package org.neo4j.cineasts.repository;

import org.neo4j.cineasts.domain.Person;
import org.springframework.data.graph.neo4j.repository.NodeGraphRepository;

/**
 * @author mh
 * @since 02.04.11
 */
public interface PersonRepository extends NodeGraphRepository<Person> {
}