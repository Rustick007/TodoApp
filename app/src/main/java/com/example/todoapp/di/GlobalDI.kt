package com.example.todoapp.di

import android.content.Context
import com.example.todoapp.data.CalendarRepository
import com.example.todoapp.data.CalendarRepositoryImpl
import com.example.todoapp.domain.EventsMiddleware
import com.example.todoapp.domain.Middleware
import com.example.todoapp.presentation.calendar.CalendarRxPresenter
import com.example.todoapp.utils.DateUtils
import com.example.todoapp.utils.DateUtilsImpl
import io.realm.Realm
import io.realm.RealmConfiguration

class GlobalDI private constructor(
    private val applicationContext: Context
) {
    private val realm: Realm by lazy {
        Realm.init(applicationContext)
        val config = RealmConfiguration.Builder()
            .deleteRealmIfMigrationNeeded()
            .name("CalendarAppDatabase")
            .build()
        Realm.setDefaultConfiguration(config)
        Realm.getDefaultInstance()
    }

    private val repository: CalendarRepository by lazy {
        CalendarRepositoryImpl(realm)
    }

    private val dateUtils: DateUtils by lazy { DateUtilsImpl() }

    private val eventsMiddleware: Middleware by lazy {
        EventsMiddleware(
            repository,
            dateUtils
        )
    }

    val presenter by lazy {
        CalendarRxPresenter(eventsMiddleware)
    }

    companion object {
        lateinit var INSTANCE: GlobalDI

        fun init(applicationContext: Context) {
            INSTANCE = GlobalDI(applicationContext)
        }
    }
}