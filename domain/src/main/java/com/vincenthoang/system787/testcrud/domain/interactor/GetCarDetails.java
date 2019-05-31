package com.vincenthoang.system787.testcrud.domain.interactor;

import com.fernandocejas.arrow.checks.Preconditions;
import com.vincenthoang.system787.testcrud.domain.Car;
import com.vincenthoang.system787.testcrud.domain.executor.PostExecutionThread;
import com.vincenthoang.system787.testcrud.domain.executor.ThreadExecutor;
import com.vincenthoang.system787.testcrud.domain.repository.CarRepository;
import io.reactivex.Observable;

import javax.inject.Inject;

/**
 * Implementation of {@link UseCase} that represents a use case for retrieving data
 * related to a specific {@link Car}
 */
public class GetCarDetails extends UseCase<Car, GetCarDetails.Params> {

    private final CarRepository mCarRepository;

    @Inject
    GetCarDetails(CarRepository carRepository, ThreadExecutor threadExecutor,
                  PostExecutionThread postExecutionThread) {
        super(threadExecutor, postExecutionThread);
        this.mCarRepository = carRepository;
    }

    @Override
    Observable<Car> buildUseCaseObservable(GetCarDetails.Params params) {
        Preconditions.checkNotNull(params);
        return this.mCarRepository.car(params.carId);
    }

    public static final class Params {

        private final int carId;

        private Params(int carId) {
            this.carId = carId;
        }

        public static Params forCar(int carId) {
            return new Params(carId);
        }
    }
}
