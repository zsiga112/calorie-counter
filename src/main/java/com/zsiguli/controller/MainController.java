package com.zsiguli.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

  @GetMapping("/")
  public String homePage() {
    return "index";
  }

  @GetMapping("/addOrEdit")
  public String addOrEditPage() {
    return "addOrEdit";
  }
}