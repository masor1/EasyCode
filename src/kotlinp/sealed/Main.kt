package kotlinp.sealed

import kotlinp.MyCallback


fun main() {
    var success = 0
    var error = 0

    val myCallback = object : MyCallback {
        override fun callSuccess() {
            success++
        }

        override fun callError() {
            error++
        }

    }

    val repository = object : Repository {
        override fun getData(): Result {
            return Result.Success(0, myCallback = myCallback)
        }
    }

    val repository1 = object : Repository {
        override fun getData(): Result {
            return Result.Error("error", myCallback = myCallback)
        }
    }

    val repository2 = object : Repository {
        override fun getData(): Result {
            return Result.Error("error", myCallback = myCallback)
        }
    }

    when (val res = repository.getData()) {
        is Result.Success -> println(res.data)
        is Result.Error -> throw IllegalArgumentException(res.message)
    }
    when (val res = repository.getData()) {
        is Result.Success -> println(res.data)
        is Result.Error -> throw IllegalArgumentException(res.message)
    }
    when (val res = repository1.getData()) {
        is Result.Success -> println(res.data)
        is Result.Error -> println(res.message)
    }
    when (val res = repository2.getData()) {
        is Result.Success -> println(res.data)
        is Result.Error -> println(res.message)
    }

    println("success -> $success\nerror -> $error")
}