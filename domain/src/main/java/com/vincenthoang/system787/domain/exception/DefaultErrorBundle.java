package com.vincenthoang.system787.domain.exception;

/**
 * Interface wrapper around Exceptions for error management
 */
public class DefaultErrorBundle implements ErrorBundle {

    private final Exception mException;
    private static final String DEFAULT_ERROR_MSG = "Unknown error";

    public DefaultErrorBundle(Exception e) {
        this.mException = e;
    }

    @Override
    public Exception getException() {
        return mException;
    }

    @Override
    public String getErrorMessage() {
        return (mException != null) ? this.mException.getMessage() : DEFAULT_ERROR_MSG;
    }
}
