package com.techacademy;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class InputController {

    @GetMapping("/input")
    public String getInput() {
        return "input";
    }

    @GetMapping("input/previous/{val}")
    public String getOutput(@PathVariable String val, Model model) {
        String previousMessage = "前回入力された値は 「" + val + "」 でした。";

        model.addAttribute("previous", previousMessage);
        return "input";
    }

}

