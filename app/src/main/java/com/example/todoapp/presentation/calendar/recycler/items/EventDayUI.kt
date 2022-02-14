package com.example.todoapp.presentation.calendar.recycler.items

import com.example.todoapp.R
import com.example.todoapp.presentation.calendar.recycler.base.ViewTyped

data class EventDayUI(
    val name: String,
    val timeRange: String,
    val description: String,
    override val uid: Int,
    override val viewType: Int = R.layout.item_event_day
) : ViewTyped