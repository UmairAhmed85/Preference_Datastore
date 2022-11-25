package com.preferences_datastore.data

import java.util.Date

enum class TaskPriority {
    HIGH, MEDIUM, LOW
}
data class Task(
    val name: String,
    val deadline: Date,
    val priority: TaskPriority,
    val completed: Boolean = false
)
