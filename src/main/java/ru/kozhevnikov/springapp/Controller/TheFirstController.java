package ru.kozhevnikov.springapp.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/first")
public class TheFirstController {

    @GetMapping("/hello")
    public String helloPage(@RequestParam(value = "name", required = false) String name,
                            @RequestParam(value = "surname", required = false) String surname,
                            Model model) {

        model.addAttribute("message", "Hello, " + name + " " + surname);
        return "first/hello";
    }

    @GetMapping("/calculator")
    public String calculatorFunction(@RequestParam(value = "number1") int number1,
                                     @RequestParam(value = "number2") int number2,
                                     @RequestParam (value = "operationType") String operationType,
                                     Model model) {
        double result;
        switch (operationType) {
            case "addition": result = number1 + number2; break;
            case "subtraction": result = number1 - number2; break;
            case "multiplication": result = number1 * number2; break;
            case "division": result = number1 / (double)number2; break;
            default: result = 0; break;
        }
        model.addAttribute("calculator","Result equals: " + result);
        return "/first/calculator";
    }

    @GetMapping("/goodbye")
    public String goodByePage() {
        return "first/goodbye";
    }
}
