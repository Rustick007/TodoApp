package com.example.todoapp

import android.app.Application
import com.example.todoapp.di.GlobalDI

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        GlobalDI.init(this)
    }
}