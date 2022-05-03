package sideProject.demo.jaeyeal.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Log4j2
@RequestMapping("/test")
@Controller
public class SampleController {

        @GetMapping("/test")
        public void test() {
            log.info("test test test test");
        }

}
