package com.kennyrozario.shopifychallenge.util;

import android.os.AsyncTask;

import org.reactivestreams.Subscription;

import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class RxUtils {

    public static Scheduler getMainScheduler() {
        return AndroidSchedulers.mainThread();
    }

    public static Scheduler getBackgroundScheduler() {
        return Schedulers.from(AsyncTask.THREAD_POOL_EXECUTOR);
    }

    public static <T extends Disposable> T unsubscribe(final T subscription) {
        if (subscription != null && !subscription.isDisposed()) {
            subscription.dispose();
        }
        return null;
    }
}
