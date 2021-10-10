package com.iservport.concurrency.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.{GetMapping, RequestMapping}

@Controller
@RequestMapping(Array("/home"))
class IndexController {

  @GetMapping
  def action(model: Model) = {
    model.addAttribute("baseName", "home")
    "frame-bootstrap-v1"
  }

}
