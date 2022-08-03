package ru.kozhevnikov.springapp.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/second")
public class TheSecondController {

    @GetMapping("/exit")
    public String exit() {
        return "second/exit";
    }
}
