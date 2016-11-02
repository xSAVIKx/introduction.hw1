package school.lemon.changerequest.java.introduction.hw1

import spock.lang.Specification
import spock.lang.Unroll

class Task7Specification extends Specification {
    @Unroll
    def "getDayTitle should return #expectedResult for dayIndex=#dayIndex"() {
        expect:
        Task7.getDayTitle(dayIndex) == expectedResult
        where:
        dayIndex || expectedResult
        1        || "Monday"
        2        || "Tuesday"
        3        || "Wednesday"
        4        || "Thursday"
        5        || "Friday"
        6        || "Saturday"
        7        || "Sunday"
        -1       || "error"
    }
}