package by.tms.controller;
import by.tms.entity.Operation;
import by.tms.service.CalcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/operation")
public class CalcController {

    @Autowired
    private CalcService calcService;

    @GetMapping("/calc")
    public String calc(Model model){
        model.addAttribute("newOperation",new Operation());
        return "calc";
    }

    @PostMapping("/calc")
    public String calc(@ModelAttribute("newOperation") Operation operation, Model model){
        double result = calcService.calc(operation);
        model.addAttribute("result",result);
        return "calc";
    }
}
