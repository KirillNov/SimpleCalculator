package com.novikov.simpleCalculator.controller;

import com.novikov.simpleCalculator.calculator.Calculator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

    @RequestMapping("/")
    public String CalculatorValues(Model model) {

        model.addAttribute("calculator", new Calculator());

        return "calc_val";
    }

    @RequestMapping("/result")
    public String CalculatorResult(@ModelAttribute("calculator") Calculator calculator, Model model) {
        int a = calculator.getValueOne();
        int b = calculator.getValueTwo();
        char symbol = calculator.getSymbol();
        if (symbol == '+') {
            int result = a + b;
            model.addAttribute("result", result);
        } else if (symbol == '-') {
            int result = a - b;
            model.addAttribute("result", result);
        } else if (symbol == '*') {
            int result = a * b;
            model.addAttribute("result", result);
        }  else if (symbol == '/') {
            double result = (double) a / b;
            model.addAttribute("result", result);
        }



        return "calc_res";
    }

}
