package com.vincenthoang.system787.testcrud.domain.repository;

import com.vincenthoang.system787.testcrud.domain.Person;
import io.reactivex.Observable;

import java.util.List;

/**
 * Interface for repository pattern for getting {@link Person} data
 */
public interface PersonRepository {
    /**
     * Get an {@link Observable} which will emit a List of {@link Person}.
     */
    Observable<List<Person>> persons();

    /**
     * Get an {@link Observable} which will emit a {@link Person}
     *
     * @param personId The person's ID used to retrieve person data
     */
    Observable<Person> person(final int personId);
}
