package oit.is.z0604.kaizi.janken2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Sample21Controller
 *
 * クラスの前に@Controllerをつけていると，HTTPリクエスト（GET/POSTなど）があったときに，このクラスが呼び出される
 */
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

}
