package net.atpco.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

/**
 * Created by atp3rxk on 1/26/2017.
 */

@RestController
public class HelloWorldController {
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String getEmployeeNames() {
        return "Welcome to Jenkins Training";
    }

}
