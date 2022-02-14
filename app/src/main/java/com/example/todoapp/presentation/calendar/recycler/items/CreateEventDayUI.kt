package com.example.todoapp.presentation.calendar.recycler.items

import com.example.todoapp.R
import com.example.todoapp.presentation.calendar.recycler.base.ViewTyped

data class CreateEventDayUI(
    var name: String = "",
    var description: String = "",
    var createEventDateInMillis: Long = 0,
    var startDateInMillis: Long = 0,
    var endDateInMillis: Long = 0,
    var id: Int = 0,
    override val uid: Int,
    override val viewType: Int = R.layout.item_create_event_day
) : ViewTyped