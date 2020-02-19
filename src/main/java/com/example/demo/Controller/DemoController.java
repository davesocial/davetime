package com.example.demo.Controller;

import com.example.demo.Servicio.TimeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * DemoController
 */

@Controller
public class DemoController {

    @Autowired
    private TimeService ts;

    @GetMapping("/time")
    @ResponseBody
    public String time () {
        return ts.getTime();
    }

    @GetMapping("/edad")
    @ResponseBody
    public String edad (
        @RequestParam ("d") Integer d,
        @RequestParam ("m") Integer m,
        @RequestParam ("a") Integer a) {

            return ts.Edad (d, m, a);
        
    }

}