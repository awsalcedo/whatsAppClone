package com.asalcedo.whatsappclone.data

data class TabData(
    val title: String
)

val tabs = listOf(
    TabData(Tabs.CHATS.value),
    TabData(Tabs.STATUS.value),
    TabData(Tabs.CALLS.value)
)

enum class Tabs(val value: String) {
    CHATS("Chats"),
    STATUS("Status"),
    CALLS("Calls")
}