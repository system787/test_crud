package com.vincenthoang.system787.testcrud.domain.exception;

/**
 * Interface wrapper for {@link java.lang.Exception}
 */
public interface ErrorBundle {
    Exception getException();

    String getErrorMessage();
}
