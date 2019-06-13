package com.vincenthoang.system787.testcrud.data.entity.mapper;


import com.vincenthoang.system787.testcrud.data.entity.PersonEntity;
import com.vincenthoang.system787.testcrud.domain.Person;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Mapper class used to transform {@link PersonEntity} (within data layer) to {@link Person} (in the domain layer)
 */
@Singleton
public class PersonEntityDataMapper {

    @Inject
    PersonEntityDataMapper() {
    }

    /**
     * Transform a {@link PersonEntity} into a {@link Person}
     *
     * @param personEntity object to be transformed
     * @return {@link Person} if valid {@link PersonEntity} otherwise null.
     */
    public Person transform(PersonEntity personEntity) {
        Person person = null;
        if (personEntity != null) {
            person = new Person(personEntity.getName(), personEntity.getId(),
                    personEntity.getAge());
        }
        return person;
    }

    /**
     * Transform a list of {@link PersonEntity} into a List of {@link Person}
     *
     * @param personEntityCollection Object collection to be transformed
     * @return {@link Person} if valid {@link PersonEntity} otherwise null.
     */
    public List<Person> transform(Collection<PersonEntity> personEntityCollection) {
        final List<Person> personList = new ArrayList<>(personEntityCollection.size());
        for (PersonEntity personEntity : personEntityCollection) {
            final Person person = transform(personEntity);
            if (person != null) {
                personList.add(person);
            }
        }
        return personList;
    }
}
