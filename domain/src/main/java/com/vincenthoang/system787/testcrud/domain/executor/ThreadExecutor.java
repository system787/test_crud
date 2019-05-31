package com.vincenthoang.system787.testcrud.domain.executor;

import com.vincenthoang.system787.testcrud.domain.interactor.UseCase;

import java.util.concurrent.Executor;

/**
 * Executor implementations for asynchronous execution will execute the
 * {@link UseCase} out of the UI thread.
 */
public interface ThreadExecutor extends Executor {

}
