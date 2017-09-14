package com.kennyrozario.shopifychallenge.util;


import java.io.IOException;

import io.reactivex.Observable;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;

public class OkHttpHelper {

    private String mUrlString;

    public OkHttpHelper(String urlString) {
        mUrlString = urlString;
    }

    public Observable<Call> getCallObservable() throws IOException {
        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url(mUrlString)
                .build();

        return Observable.just(client.newCall(request));
    }
}
