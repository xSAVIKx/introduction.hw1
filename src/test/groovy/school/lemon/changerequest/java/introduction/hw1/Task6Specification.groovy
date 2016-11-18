package school.lemon.changerequest.java.introduction.hw1

import spock.lang.Specification
import spock.lang.Unroll

import static spock.util.matcher.HamcrestMatchers.closeTo

class Task6Specification extends Specification {
    @Unroll
    def "calculateS should return #expectedResult for x=#x"() {
        expect:
        expectedResult closeTo(Task6.calculateS(x), 0.001)
        where:
        x    || expectedResult
        1.45 || 4.193
        1.23 || 3.391
        -1   || 0.375
        0    || 1
        4    || 34.333
    }

    @Unroll
    def "calculateZ should return #expectedResult for x=#x, y=#y"() {
        expect:
        expectedResult closeTo(Task6.calculateZ(x, y), 0.001)
        where:
        x    | y    || expectedResult
        1.45 | 1.22 || 0.210
        1.23 | 2.25 || 1.352
        -1   | 2.51 || -0.190
        0.1  | 0    || 1.000
    }
}