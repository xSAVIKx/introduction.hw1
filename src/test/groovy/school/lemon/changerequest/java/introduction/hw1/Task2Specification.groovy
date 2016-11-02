package school.lemon.changerequest.java.introduction.hw1

import spock.lang.Specification
import spock.lang.Unroll

class Task2Specification extends Specification {
    @Unroll
    def "getMeters should return #expectedResult for centimeters=#centimeters"() {
        expect:
        Task2.getMeters(centimeters) == expectedResult
        where:
        centimeters || expectedResult
        105         || 1
        223         || 2
        1001        || 10
        1301        || 13
    }
}