package com.techacademy;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class InputController {

    @GetMapping({"/input", "/input/previous/{val}", "/input/previous/"})
    public String getInput(@PathVariable(required = false) String val, Model model) {
        if (val != null ) {
            String previousMessage = "前回入力された値は 「" + val + "」 でした。";
            model.addAttribute("previous", previousMessage);
        }

        else {

        }
        return "input";
    }

}

