class DateRange(val start: MyDate, val endInclusive: MyDate) {
    operator fun contains(first: MyDate): Boolean {
        return start <  first && first <= endInclusive
    }
}

fun checkInRange(date: MyDate, first: MyDate, last: MyDate): Boolean {
    return date in DateRange(first, last)
}
