package com.vincenthoang.system787.testcrud.data.cache.serializer;

import com.google.gson.Gson;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Json Serializer/Deserializer
 */
@Singleton
public class Serializer {
    private final Gson gson = new Gson();

    @Inject
    Serializer() {
    }

    /**
     * Serialize an object to Json format
     *
     * @param o Object to serialize
     * @param c Class name of object
     * @return Json String object
     */
    public String serialize(Object o, Class c) {
        return gson.toJson(o, c);
    }

    /**
     * Deserialize a json String object
     * @param s The Json String to deserialize
     * @param c The Class name of the object to reintegrate
     * @param <T> The class type to return
     * @return object of class <T> recreated from Json data
     */
    public <T> T deserialize(String s, Class<T> c) {
        return gson.fromJson(s, c);
    }
}
