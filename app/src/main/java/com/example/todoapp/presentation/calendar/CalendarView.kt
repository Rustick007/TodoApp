package com.example.todoapp.presentation.calendar

import com.applandeo.materialcalendarview.EventDay
import com.example.todoapp.presentation.calendar.recycler.base.ViewTyped

interface CalendarView {
    fun showLoading()
    fun showCalendarEvents(calendarEvents: List<EventDay>)
    fun showEventsByDate(recyclerEvents: List<ViewTyped>)
}
