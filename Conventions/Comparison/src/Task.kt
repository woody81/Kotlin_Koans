data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int) : Comparable<MyDate> {
    override operator fun compareTo(a: MyDate) =
        when {
            this.year != a.year -> this.year - a.year
            this.month != a.month -> this.month - a.month
            else -> this.dayOfMonth - a.dayOfMonth
        }
//        var result = this.year.compareTo(a.year)
//        if (result != 0) {
//            return result;
//        }
//        result = this.month.compareTo(a.month)
//        if (result != 0) {
//            return result;
//        }
//        return this.dayOfMonth.compareTo(a.dayOfMonth)
}

fun test(date1: MyDate, date2: MyDate) {
    // this code should compile:
    println(date1 < date2)
}
