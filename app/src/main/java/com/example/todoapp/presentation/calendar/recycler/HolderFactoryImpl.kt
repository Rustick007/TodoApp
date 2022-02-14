package com.example.todoapp.presentation.calendar.recycler

import android.view.View
import com.example.todoapp.R
import com.example.todoapp.presentation.calendar.recycler.base.BaseViewHolder
import com.example.todoapp.presentation.calendar.recycler.base.HolderFactory
import com.example.todoapp.presentation.calendar.recycler.holders.CreateEventDayHolder
import com.example.todoapp.presentation.calendar.recycler.holders.EventDayHolder

class HolderFactoryImpl : HolderFactory() {

    override fun createViewHolder(view: View, viewType: Int): BaseViewHolder<*>? {
        return when (viewType) {
            R.layout.item_event_day -> EventDayHolder(view, clicks)
            R.layout.item_create_event_day -> CreateEventDayHolder(view, clicks)
            else -> null
        }
    }
}