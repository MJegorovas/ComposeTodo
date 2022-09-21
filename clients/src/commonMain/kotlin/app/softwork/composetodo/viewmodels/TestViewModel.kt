package app.softwork.composetodo.viewmodels

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.flow

class TestViewModel : ViewModel() {
    val test = flow{
        var i = 0
        while (true) {
            delay(500)
            i += 1
            emit(i)
        }
    }
}