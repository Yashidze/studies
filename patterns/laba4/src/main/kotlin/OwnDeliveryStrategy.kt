class OwnDeliveryStrategy : Strategy {
    @Override
    override fun calculateCost(distance: Double): Double {
        // Реалізація розрахунку вартості доставки власною службою
        // ...
        return distance
    }
}