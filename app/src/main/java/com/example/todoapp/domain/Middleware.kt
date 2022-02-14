package com.example.todoapp.domain

import com.applandeo.materialcalendarview.EventDay
import com.example.todoapp.data.CalendarRepository
import com.example.todoapp.presentation.calendar.recycler.items.EventDayUI
import com.example.todoapp.utils.DateUtils
import io.reactivex.Observable

interface Middleware {
    val repository: CalendarRepository
    val dateUtils: DateUtils
    fun getCalendarEvents(): Observable<List<EventDay>>
    fun getEventsByDate(timeInMillis: Long): Observable<List<EventDayUI>>
    fun addEvent(name: String, description: String, startDateInMillis: Long, endDateInMillis: Long)
}