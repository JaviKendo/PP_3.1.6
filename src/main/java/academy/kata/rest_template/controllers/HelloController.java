package academy.kata.rest_template.controllers;

import academy.kata.rest_template.services.ResultService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController {

    private final ResultService result;

    public HelloController(ResultService result) {
        this.result = result;
    }

    @GetMapping(value = "/")
    public String printWelcome(ModelMap model) {
        List<String> messages = new ArrayList<>();
        messages.add("Full result: " + result.getResult());
        messages.add("ResultServiceImpl of the first part: " + result.getResultOfTheFirstPart());
        messages.add("ResultServiceImpl of the second part: " + result.getResultOfTheSecondPart());
        messages.add("ResultServiceImpl of the third part: " + result.getResultOfTheThirdPart());
        model.addAttribute("messages", messages);

        return "index";
    }

}