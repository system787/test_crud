package com.vincenthoang.system787.testcrud.data.entity.mapper;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.vincenthoang.system787.testcrud.data.entity.CarEntity;

import javax.inject.Inject;
import java.lang.reflect.Type;
import java.util.List;

/**
 * Class used to transform from Json String objects to {@link CarEntity} objects
 */
public class CarEntityJsonMapper {

    private final Gson gson;

    @Inject
    public CarEntityJsonMapper() {
        this.gson = new Gson();
    }

    /**
     * Transform from valid json String to {@link CarEntity}
     *
     * @param carJsonResponse A json representing car object
     * @return {@link CarEntity}
     * @throws JsonSyntaxException if the json string is not of valid structure
     */
    public CarEntity transformCarEntity(String carJsonResponse)
            throws JsonSyntaxException {
        final Type carEntityType =
                new TypeToken<CarEntity>() {
                }.getType();

        return this.gson.fromJson(carJsonResponse, carEntityType);
    }

    /**
     * Transform from valid json string to list of {@link CarEntity}
     *
     * @param carListJsonResponse Json String representing a collection of cars.
     * @return List of {@link CarEntity}
     * @throws JsonSyntaxException if the json string is not of valid structure
     */
    public List<CarEntity> transformCarEntityCollection(String carListJsonResponse)
            throws JsonSyntaxException {
        final Type listOfCarEntityType =
                new TypeToken<List<CarEntity>>() {
                }.getType();

        return this.gson.fromJson(carListJsonResponse, listOfCarEntityType);
    }
}
