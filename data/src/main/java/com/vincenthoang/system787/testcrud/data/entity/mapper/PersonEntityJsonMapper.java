package com.vincenthoang.system787.testcrud.data.entity.mapper;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.vincenthoang.system787.testcrud.data.entity.PersonEntity;

import javax.inject.Inject;
import java.lang.reflect.Type;
import java.util.List;

/**
 * Class used to transform from Json String objects to {@link PersonEntity} objects
 */
public class PersonEntityJsonMapper {

    private final Gson gson;

    @Inject
    public PersonEntityJsonMapper() {
        this.gson = new Gson();
    }

    /**
     * Transform from valid json string to {@link PersonEntity}
     *
     * @param personJsonResponse A json representing person object
     * @return {@link PersonEntity}
     * @throws JsonSyntaxException if the json string is not of valid structure
     */
    public PersonEntity transformPersonEntity(String personJsonResponse)
            throws JsonSyntaxException {
        final Type personEntityType =
                new TypeToken<PersonEntity>() {
                }.getType();

        return this.gson.fromJson(personJsonResponse, personEntityType);
    }

    /**
     * Transform from valid json string to List of {@link PersonEntity}
     *
     * @param personListJsonResponse Json String representing a collection of Person objects
     * @return List of {@link PersonEntity}
     * @throws JsonSyntaxException if the json string is not of valid structure
     */
    public List<PersonEntity> transformPersonEntityCollection(String personListJsonResponse)
            throws JsonSyntaxException {
        final Type listOfPersonEntityType =
                new TypeToken<List<PersonEntity>>() {
                }.getType();

        return this.gson.fromJson(personListJsonResponse, listOfPersonEntityType);
    }
}
