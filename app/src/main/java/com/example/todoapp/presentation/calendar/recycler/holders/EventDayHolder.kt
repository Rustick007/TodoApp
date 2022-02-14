package com.example.todoapp.presentation.calendar.recycler.holders

import android.view.View
import android.widget.TextView
import com.example.todoapp.R
import com.example.todoapp.presentation.calendar.recycler.base.BaseViewHolder
import com.example.todoapp.presentation.calendar.recycler.base.RecyclerItemClicksObservable
import com.example.todoapp.presentation.calendar.recycler.items.EventDayUI

data class EventDayHolder(
    val view: View,
    val clicks: RecyclerItemClicksObservable
) : BaseViewHolder<EventDayUI>(view) {

    private val tvEventName = view.findViewById<TextView>(R.id.tvEventName)
    private val tvTimeRange = view.findViewById<TextView>(R.id.tvTimeRange)

    init {
        clicks.accept(this)
    }

    override fun bind(item: EventDayUI) {
        tvEventName.text = item.name
        tvTimeRange.text = item.timeRange
    }
}