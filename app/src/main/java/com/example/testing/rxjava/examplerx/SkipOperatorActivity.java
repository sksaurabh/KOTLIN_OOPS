package com.example.testing.rxjava.examplerx;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.observers.DisposableObserver;

public class SkipOperatorActivity extends AppCompatActivity {

    private static final String TAG = SkipOperatorActivity.class.getSimpleName();


    private CompositeDisposable disposable = new CompositeDisposable();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Example 1
        disposable.add(
                Observable.just(1, 2, 3, 4, 5, 6)
                        .skip(3)
                        .subscribeWith(new DisposableObserver<Integer>() {
                            @Override
                            public void onNext(Integer integer) {
                                Log.d(TAG, "onNext: " + integer);
                            }

                            @Override
                            public void onError(Throwable e) {

                            }

                            @Override
                            public void onComplete() {
                                Log.d(TAG, "All items emitted!");
                            }
                        }));

        // Example 2
        // TODO - description needed
        // alternately you can use skipInitialValue()
     /*   disposable.add(
                RxTextView.textChangeEvents(inputSearch)
                        .skip(1)
                        .debounce(300, TimeUnit.MILLISECONDS)
                        .subscribeOn(Schedulers.io())
                        .observeOn(AndroidSchedulers.mainThread())
                        .subscribeWith(searchQuery()));*/
    }

   /* private DisposableObserver<TextViewTextChangeEvent> searchQuery() {
        return new DisposableObserver<TextViewTextChangeEvent>() {
            @Override
            public void onNext(TextViewTextChangeEvent textViewTextChangeEvent) {
                Log.e(TAG, "Search: " + textViewTextChangeEvent.text());
            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onComplete() {

            }
        };
    }*/

    @Override
    protected void onDestroy() {
        super.onDestroy();
        //unbinder.unbind();
    }
}
