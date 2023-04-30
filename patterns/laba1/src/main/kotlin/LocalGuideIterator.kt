class LocalGuideIterator(private val places: List<TouristPlace>) : TouristPlaceIterator {
    private var position = 0
    override fun hasNext(): Boolean {
        while (position < places.size) {
            val place = places[position]
            if (place.location == "local guide recommended") {
                return true
            }
            position++
        }
        return false
    }

    override fun next(): Any {
        val place = places[position]
        position++
        return place
    }
}
