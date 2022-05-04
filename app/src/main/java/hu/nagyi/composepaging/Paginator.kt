package hu.nagyi.composepaging

interface Paginator<Key, Item> {
    suspend fun loadNextItems()
    fun reset()
}