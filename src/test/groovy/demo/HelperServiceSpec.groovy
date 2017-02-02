package demo

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.services.ServiceUnitTestMixin} for usage instructions
 */
@TestFor(HelperService)
class HelperServiceSpec extends Specification {

    void "test something"() {
        expect:"fix me"
        service.serviceMethod() == 42
    }
}
