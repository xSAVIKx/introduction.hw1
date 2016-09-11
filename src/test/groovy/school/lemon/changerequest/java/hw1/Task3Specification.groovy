package school.lemon.changerequest.java.hw1

import spock.lang.Specification
import spock.lang.Unroll


class Task3Specification extends Specification {
    @Unroll
    def "isBetween should return #expectedResult for a=#a, b=#b, c=#c"() {
        expect:
        Task3.isBetween(a, b, c) == expectedResult
        where:
        a   | b   | c  || expectedResult
        1   | 2   | 3  || true
        5   | 4   | -1 || true
        6   | 6   | 6  || true
        -1  | -2  | 0  || false
        -28 | -26 | 26 || true
    }
}