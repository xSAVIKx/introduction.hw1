package school.lemon.changerequest.java.introduction.hw1

import spock.lang.Specification
import spock.lang.Unroll

import static spock.util.matcher.HamcrestMatchers.closeTo

class Task5Specification extends Specification {
    @Unroll
    def "calculateA should return #expectedResult for x=#x, y=#y, z=#z"() {
        expect:
        expectedResult closeTo(Task5.calculateA(x, y, z), 0.001)
        where:
        x    | y    | z     || expectedResult
        1.45 | 1.22 | 3.5   || 4.424
        1.23 | 2.25 | 5.6   || 11.012
        -1   | 2.51 | -8.12 || 1.373
    }
}