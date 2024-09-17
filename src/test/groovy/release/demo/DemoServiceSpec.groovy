package release.demo

import grails.testing.services.ServiceUnitTest
import spock.lang.Specification

class DemoServiceSpec extends Specification implements ServiceUnitTest<DemoService> {

     void "test something"() {
        expect:
        service.doSomething() == 'It works!'
     }
}
