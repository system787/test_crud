package com.vincenthoang.system787.testcrud.domain.executor;

import io.reactivex.Scheduler;

public interface PostExecutionThread {
    Scheduler getScheduler();
}
