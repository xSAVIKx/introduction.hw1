package school.lemon.changerequest.java.hw1

import spock.lang.Specification
import spock.lang.Unroll

import static spock.util.matcher.HamcrestMatchers.closeTo


class Task1Specification extends Specification {
    @Unroll
    def "calculateP should return #expectedResult for a=#a"() {
        expect:
        expectedResult closeTo(Task1.calculateP(a), 0.001)
        where:
        a    || expectedResult
        1    || 4
        2.5  || 10
        3.35 || 13.4
    }
}