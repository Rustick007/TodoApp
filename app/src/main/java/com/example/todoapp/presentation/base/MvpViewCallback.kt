package com.example.todoapp.presentation.base

import com.example.todoapp.presentation.base.presenter.Presenter


interface MvpViewCallback<View, P : Presenter<View>> {
    fun getPresenter(): P
    fun getMvpView(): View
}