package kotlinp.sealed

import kotlinp.MyCallback

sealed class Result {
    class Success(val data: Int, myCallback: MyCallback): Result() {
        init {
            myCallback.callSuccess()
        }
    }
    class Error(val message: String, myCallback: MyCallback): Result() {
        init {
            myCallback.callError()
        }
    }
}
