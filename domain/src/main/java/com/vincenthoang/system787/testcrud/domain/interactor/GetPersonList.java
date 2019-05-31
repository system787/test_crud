package com.vincenthoang.system787.testcrud.domain.interactor;

import com.vincenthoang.system787.testcrud.domain.Person;
import com.vincenthoang.system787.testcrud.domain.executor.PostExecutionThread;
import com.vincenthoang.system787.testcrud.domain.executor.ThreadExecutor;
import com.vincenthoang.system787.testcrud.domain.repository.PersonRepository;
import io.reactivex.Observable;

import javax.inject.Inject;
import java.util.List;

/**
 * Implementation of {@link UseCase} representing a use case for retrieving a collection
 * of all {@link Person}.
 */
public class GetPersonList extends UseCase<List<Person>, Void> {
    private final PersonRepository mPersonRepository;

    @Inject
    GetPersonList(PersonRepository personRepository, ThreadExecutor threadExecutor,
                  PostExecutionThread postExecutionThread) {
        super(threadExecutor, postExecutionThread);
        this.mPersonRepository = personRepository;
    }

    @Override
    Observable<List<Person>> buildUseCaseObservable(Void aVoid) {
        return null;
    }
}
