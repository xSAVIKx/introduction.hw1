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
        2   || 54
        3   || 199
        4   || 492
        5   || 985
        6   || 1730
        7   || 2779
        372 || 445596604
    }
}