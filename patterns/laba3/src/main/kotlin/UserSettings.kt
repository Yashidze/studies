class UserSettings {
    private var receiveEmailNotifications = false
    private var receivePushNotifications = false
    private var receiveSMSNotifications = false

    // Конструктор та методи отримання та встановлення значень полів
    // ...

    fun saveToSnapshot(): UserSettingsSnapshot {
        return UserSettingsSnapshot(
            receiveEmailNotifications,
            receivePushNotifications,
            receiveSMSNotifications
        )
    }

    fun restoreFromSnapshot(snapshot: UserSettingsSnapshot) {
        receiveEmailNotifications = snapshot.receiveEmailNotifications
        receivePushNotifications = snapshot.receivePushNotifications
        receiveSMSNotifications = snapshot.receiveSMSNotifications
    }
}