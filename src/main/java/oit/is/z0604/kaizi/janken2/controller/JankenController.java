package oit.is.z0604.kaizi.janken2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class JankenController {

  @GetMapping("/janken.html")
  public String janken() {
    return "janken.html";
  }

  @PostMapping("/name")
  public String name(@RequestParam String name, ModelMap model) {
    String nameResult = name;
    model.addAttribute("nameResult", nameResult);
    return "janken.html";
  }

  @GetMapping("/rock")
  public String rock(ModelMap model) {
    String hand = "Gu";
    String result = "Draw!";
    model.addAttribute("hand", hand);
    model.addAttribute("result", result);
    return "janken.html";
  }

  @GetMapping("/scissors")
  public String scissors(ModelMap model) {
    String hand = "Choki";
    String result = "You Lose!";
    model.addAttribute("hand", hand);
    model.addAttribute("result", result);
    return "janken.html";
  }

  @GetMapping("/paper")
  public String paper(ModelMap model) {
    String hand = "Pa";
    String result = "You Win!";
    model.addAttribute("hand", hand);
    model.addAttribute("result", result);
    return "janken.html";
  }

}
