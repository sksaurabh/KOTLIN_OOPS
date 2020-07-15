import android.content.ContentValues
import android.util.Log
import io.reactivex.Observable
import io.reactivex.Observer
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import java.util.*


fun main(args: Array<String>) {

        val list =
            Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        val observable =
            Observable.fromIterable(list)
        observable.subscribe { item: Int? -> println(item) }


}
