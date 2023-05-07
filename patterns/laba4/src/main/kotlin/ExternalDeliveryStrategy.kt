class ExternalDeliveryStrategy : Strategy {
    @Override
    override fun calculateCost(distance: Double): Double {
        // Реалізація розрахунку вартості доставки зовнішньою службою
        // ...
        return distance
    }
}