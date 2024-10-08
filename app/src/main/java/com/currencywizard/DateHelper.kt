package com.currencywizard

import java.text.SimpleDateFormat
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.Calendar
import java.util.Date

enum class PeriodsTime(val value: Int, val period: Int) {
    OVER_FIVE_YEARS(-5, Calendar.YEAR),
    OVER_THREE_YEARS(-3, Calendar.YEAR),
    OVER_ONE_YEARS(-1, Calendar.YEAR),
    OVER_THREE_MONTHS(-3, Calendar.MONTH)
}

class DateHelper {

    companion object {
        val formatter = SimpleDateFormat("yyyy-MM-dd")

        fun getCurrentDateInFormatted(): String {
            val time = Calendar.getInstance().time
            return formatter.format(time)
        }

        fun getDateOverInFormatted(periodsTime: PeriodsTime): String {
            val calendar = Calendar.getInstance()
            calendar.add(periodsTime.period, periodsTime.value)
            val time = calendar.time
            return formatter.format(time)
        }

        fun dateToFloat(dateFormat: SimpleDateFormat, dateString: String): Float {
            val date = dateFormat.parse(dateString)
            return date?.time?.toFloat() ?: 0f
        }
    }
}