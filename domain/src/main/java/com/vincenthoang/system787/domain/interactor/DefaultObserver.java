package com.vincenthoang.system787.domain.interactor;

import io.reactivex.observers.DisposableObserver;

/**
 * Default {@link DisposableObserver} base class for default error handling
 * @param <T>
 */
public class DefaultObserver<T> extends DisposableObserver<T> {
    @Override
    public void onNext(T t) {

    }

    @Override
    public void onComplete() {

    }

    @Override
    public void onError(Throwable exception) {

    }
}
