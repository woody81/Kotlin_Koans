class DateRange(val start: MyDate, val end: MyDate):Iterable<MyDate> {
    override fun iterator():Iterator<MyDate> {
        return MyDateIterator(start, end)
    }
}

class MyDateIterator(start: MyDate, end: MyDate) : Iterator<MyDate> {

    private var current = start
    private val endDay = end


    override fun hasNext(): Boolean {
        return current < endDay
    }

    override fun next(): MyDate {
        return current.nextDay()
    }

}

fun iterateOverDateRange(firstDate: MyDate, secondDate: MyDate, handler: (MyDate) -> Unit) {
    for (date in firstDate..secondDate) {
        handler(date)
    }
}
