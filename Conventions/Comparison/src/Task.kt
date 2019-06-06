data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int) : Comparable<MyDate> {
    override fun compareTo(other: MyDate): Int {
        if (other.year < year) {
            return 1
        } else if (other.year > year) {
            return -1
        }
        if (other.month < month) {
            return 1
        } else if (other.month > month) {
            return -1
        }
        if (other.dayOfMonth < dayOfMonth) {
            return 1
        } else if (other.dayOfMonth > dayOfMonth) {
            return -1
        }
        return 0
    }
}

fun compare(date1: MyDate, date2: MyDate) = date1 < date2
