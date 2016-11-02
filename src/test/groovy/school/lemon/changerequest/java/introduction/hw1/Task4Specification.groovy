package school.lemon.changerequest.java.introduction.hw1

import spock.lang.Specification
import spock.lang.Unroll


class Task4Specification extends Specification {
    @Unroll
    def "getSumOfGreatest should return #expectedResult for a=#a, b=#b, c=#c"() {
        expect:
        Task4.getSumOfGreatest(a, b, c) == expectedResult
        where:
        a   | b   | c  || expectedResult
        1   | 2   | 3  || 5
        5   | 4   | -1 || 9
        6   | 6   | 6  || 12
        -1  | -2  | 0  || -1
        -28 | -26 | 26 || 0
    }
}