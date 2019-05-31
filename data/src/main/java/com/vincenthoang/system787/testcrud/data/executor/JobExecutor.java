package com.vincenthoang.system787.testcrud.data.executor;
import com.vincenthoang.system787.testcrud.domain.executor.ThreadExecutor;
import io.reactivex.annotations.NonNull;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Implementation for {@link java.util.concurrent.ThreadPoolExecutor}
 */
@Singleton
public class JobExecutor implements ThreadExecutor {
    private final ThreadPoolExecutor mThreadPoolExecutor;

    @Inject
    JobExecutor() {
        this.mThreadPoolExecutor = new ThreadPoolExecutor(3,
                5, 10, TimeUnit.SECONDS,
                new LinkedBlockingQueue<>(), new JobThreadFactory());
    }

    @Override
    public void execute(@NonNull Runnable command) {
        this.mThreadPoolExecutor.execute(command);
    }

    private static class JobThreadFactory implements ThreadFactory {
        private int counter = 0;

        @Override
        public Thread newThread(@NonNull Runnable runnable) {
            return new Thread(runnable, "crud_" + counter++);
        }
    }
}
