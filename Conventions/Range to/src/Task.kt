class DateRange(override val start: MyDate, override val endInclusive: MyDate): ClosedRange<MyDate>

operator fun MyDate.rangeTo(other: MyDate) = DateRange(this, other)

fun checkInRange(date: MyDate, first: MyDate, last: MyDate): Boolean {
    return date in first..last
}
