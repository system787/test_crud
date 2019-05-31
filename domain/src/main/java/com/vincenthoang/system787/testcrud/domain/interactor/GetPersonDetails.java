package com.vincenthoang.system787.testcrud.domain.interactor;

import com.fernandocejas.arrow.checks.Preconditions;
import com.vincenthoang.system787.testcrud.domain.Person;
import com.vincenthoang.system787.testcrud.domain.executor.PostExecutionThread;
import com.vincenthoang.system787.testcrud.domain.executor.ThreadExecutor;
import com.vincenthoang.system787.testcrud.domain.repository.PersonRepository;
import io.reactivex.Observable;

import javax.inject.Inject;

/**
 * Implementation of {@link UseCase} that represents a use case for retrieving data
 * related to a specific {@link Person}
 */
public class GetPersonDetails extends UseCase<Person, GetPersonDetails.Params> {

    private final PersonRepository mPersonRepository;

    @Inject
    GetPersonDetails(PersonRepository personRepository, ThreadExecutor threadExecutor,
                     PostExecutionThread postExecutionThread) {
        super(threadExecutor, postExecutionThread);
        this.mPersonRepository = personRepository;
    }

    @Override
    Observable<Person> buildUseCaseObservable(GetPersonDetails.Params params) {
        Preconditions.checkNotNull(params);
        return this.mPersonRepository.person(params.personId);
    }

    public static final class Params {

        private final int personId;

        private Params(int personId) {
            this.personId = personId;
        }

        public static Params forPerson(int personId) {
            return new Params(personId);
        }
    }
}
