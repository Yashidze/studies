class UserSettingsCaretaker {
    var snapshot: UserSettingsSnapshot? = null
        private set

    fun saveSnapshot(snapshot: UserSettingsSnapshot?) {
        this.snapshot = snapshot
    }
}