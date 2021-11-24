package kotlinp.sealed


fun main() {
    val repository = object  : Repository {
        override fun getData(): Result {
            TODO()
        }
    }

    when (val res = repository.getData()) {
        is Result.Success -> println(res.data)
        is Result.Error -> throw IllegalArgumentException(res.message)
    }
}