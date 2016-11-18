package school.lemon.changerequest.java.introduction.hw1

import spock.lang.Specification
import spock.lang.Unroll


class Task8Specification extends Specification {
    @Unroll
    def "calculateSum should return #expectedResult for N=#N"() {
        expect:
        Task8.calculateSum(N) == expectedResult
        where:
        N   || expectedResult
        1   || 5
        2   || 29
        3   || 86
        4   || 190
        5   || 355
        6   || 595
        7   || 924
        372 || 120463334
    }
}