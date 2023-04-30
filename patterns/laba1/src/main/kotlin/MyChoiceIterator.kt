class MyChoiceIterator(private val places: List<TouristPlace>) : TouristPlaceIterator {
    private var position = 0
    override fun hasNext(): Boolean {
        return position < places.size
    }

    override fun next(): Any {
        val place = places[position]
        position++
        return place
    }
}