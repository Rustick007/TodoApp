package com.example.todoapp.utils

interface DateUtils {
    fun areDatesIsSame(firstDateInMillis: Long, secondDateInMillis: Long): Boolean
    fun formatToTimeRange(startDateInMillis: Long, endDateInMillis: Long): String
}