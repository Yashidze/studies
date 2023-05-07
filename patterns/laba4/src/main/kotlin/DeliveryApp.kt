class DeliveryApp {
    private var strategy: Strategy? = null
    fun getStrategy(strategy: Strategy?) {
        this.strategy = strategy
    }

    fun calculateDeliveryCost(distance: Double): Double {
        return strategy!!.calculateCost(distance)
    }
}