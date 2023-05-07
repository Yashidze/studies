fun main(args: Array<String>?) {
        val userSettings = UserSettings()
        val caretaker = UserSettingsCaretaker()
        caretaker.saveSnapshot(userSettings.saveToSnapshot())
    }