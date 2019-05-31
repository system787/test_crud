package com.vincenthoang.system787.testcrud.domain.interactor;

import com.vincenthoang.system787.testcrud.domain.Car;
import com.vincenthoang.system787.testcrud.domain.executor.PostExecutionThread;
import com.vincenthoang.system787.testcrud.domain.executor.ThreadExecutor;
import com.vincenthoang.system787.testcrud.domain.repository.CarRepository;
import io.reactivex.Observable;

import javax.inject.Inject;
import java.util.List;

/**
 * Implementation of {@link UseCase} representing a use case for retrieving a collection
 * of all {@link Car}
 */
public class GetCarList extends UseCase<List<Car>, Void>{
    private final CarRepository mCarRepository;

    @Inject
    GetCarList(CarRepository carRepository, ThreadExecutor threadExecutor,
               PostExecutionThread postExecutionThread) {
        super(threadExecutor, postExecutionThread);
        this.mCarRepository = carRepository;
    }

    @Override
    Observable<List<Car>> buildUseCaseObservable(Void aVoid) {
        return this.mCarRepository.cars();
    }
}
