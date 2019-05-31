package com.vincenthoang.system787.testcrud.domain;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PersonTest {

    private static final int FAKE_PERSON_ID = 7;

    private Person mPerson;

    @Before
    public void setUp() {
        mPerson = new Person(FAKE_PERSON_ID);
    }

    @Test
    public void testUserConstructorEqualsCase() {
        final int personId = mPerson.getId();

        assertThat(personId).isEqualTo(FAKE_PERSON_ID);
    }
}
