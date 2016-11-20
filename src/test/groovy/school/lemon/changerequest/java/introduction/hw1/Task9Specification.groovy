package school.lemon.changerequest.java.introduction.hw1

import spock.lang.Specification
import spock.lang.Unroll


class Task9Specification extends Specification {
    @Unroll
    def "isPowerOfThree should return #expectedResult for n=#n"() {
        expect:
        Task9.isPowerOfThree(n) == expectedResult
        where:
        n  || expectedResult
        27 || true
        15 || false
        9  || true
        81 || true
        21 || false
        1  || true
        3  || true
        0  || false
    }
}