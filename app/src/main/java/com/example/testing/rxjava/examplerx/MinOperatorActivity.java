package com.example.testing.rxjava.examplerx;

import android.os.Bundle;
import android.util.Log;

import org.reactivestreams.Subscriber;

import androidx.appcompat.app.AppCompatActivity;
import io.reactivex.Observable;
import rx.observables.MathObservable;
public class MinOperatorActivity extends AppCompatActivity {

    private static final String TAG = MinOperatorActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       /* Observable<Integer> observable = Observable.range(1, 10);

        MathObservable.min(observable).subscribe(new Subscriber<Integer>() {
            @Override
            public void onCompleted() {

            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onNext(Integer integer) {
                Log.e(TAG, "Min of 1-10 is: " + integer);
            }
        });

        Observable<Float> floatObservable = Observable.just(10.5f, 11.5f, 14.5f);
        MathObservable.min(floatObservable)
                .subscribe(new Subscriber<Float>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onNext(Float aFloat) {
                        Log.e(TAG, "Min of 10.5f, 11.5f, 14.5f: " + aFloat);
                    }
                });

        Observable<Double> doubleObservable = Observable.just(13.5D, 45.3D, 33.6D);
        MathObservable.min(doubleObservable)
                .subscribe(new rx.Observer<Double>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onNext(Double aDouble) {
                        Log.e(TAG, "Min of 13.5D, 45.3D, 33.6D: " + aDouble);
                    }
                });*/
    }
}