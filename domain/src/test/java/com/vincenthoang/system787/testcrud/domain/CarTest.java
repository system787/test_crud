package com.vincenthoang.system787.testcrud.domain;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {

    private static final int FAKE_CAR_ID = 6;

    private Car mCar;

    @Before
    public void setUp() {
        mCar = new Car(FAKE_CAR_ID);
    }

    @Test
    public void testCarConstructorNotEqualsCase() {
        final int carId = mCar.getId() + 1;

        assertThat(carId).isNotEqualTo(FAKE_CAR_ID);
    }
}
