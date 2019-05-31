package com.vincenthoang.system787.domain.repository;

import com.vincenthoang.system787.domain.Car;
import io.reactivex.Observable;

import java.util.List;

/**
 * Interface for repository pattern for getting {@link Car} data
 */
public interface CarRepository {
    /**
     * Get an {@link Observable} which will emit a List of {@link Car}.
     *
     */
    Observable<List<Car>> cars();

    /**
     * Get an {@link Observable} which will emit a {@link Car}
     *
     * @param carId The person's ID used to retrieve person data
     */
    Observable<Car> car(final int carId);
}
