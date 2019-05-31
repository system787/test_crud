package com.vincenthoang.system787.domain.executor;

import java.util.concurrent.Executor;

/**
 * Executor implementations for asynchronous execution will execute the
 * {@link com.vincenthoang.system787.domain.interactor.UseCase} out of the UI thread.
 */
public interface ThreadExecutor extends Executor {

}
