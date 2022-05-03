package sideProject.demo.jaeyeal.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Log4j2
@RequestMapping("/test")
@RestController
public class SampleController {

        @GetMapping(value="")
        public String test() {
            log.info("test test test test");
            return "TEST COMPLETE?? jayeal test?";
        }

}
