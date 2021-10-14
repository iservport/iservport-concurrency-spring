package com.iservport.concurrency.controller

import com.iservport.concurrency.domain.Game
import org.springframework.web.bind.annotation.{GetMapping, RequestMapping, RestController}

@RequestMapping(value = Array("/api/game"))
@RestController
class GameController {

  @GetMapping(Array("/start"))
  def newGame(): Game = Game.newGame

  @GetMapping(Array("/pick"))
  def pick(index: Int): Game = ???
}
