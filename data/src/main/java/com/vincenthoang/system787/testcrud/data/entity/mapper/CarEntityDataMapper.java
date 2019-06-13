package com.vincenthoang.system787.testcrud.data.entity.mapper;

import com.vincenthoang.system787.testcrud.data.entity.CarEntity;
import com.vincenthoang.system787.testcrud.domain.Car;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Mapper class used to transform {@link CarEntity} (within data layer) to {@link Car} (within domain layer)
 */
@Singleton
public class CarEntityDataMapper {

    @Inject
    CarEntityDataMapper() {
    }

    /**
     * Transform a {@link CarEntity} into a {@link Car}
     *
     * @param carEntity object to be transformed
     * @return {@link Car} if valid {@link CarEntity} otherwise null.
     */
    public Car transform(CarEntity carEntity) {
        Car car = null;
        if (carEntity != null) {
            car = new Car(
                    carEntity.getMake(), carEntity.getModel(),
                    carEntity.getColor(), carEntity.getYear(),
                    carEntity.getId());
        }
        return car;
    }

    public List<Car> transform(Collection<CarEntity> carEntityCollection) {
        final List<Car> carList = new ArrayList<>(carEntityCollection.size());
        for (CarEntity carEntity : carEntityCollection) {
            final Car car = transform(carEntity);
            if (car != null) {
                carList.add(car);
            }
        }
        return carList;
    }
}

