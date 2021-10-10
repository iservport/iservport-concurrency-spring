package com.iservport.concurrency.controller

import com.iservport.concurrency.domain.Game
import org.springframework.expression.Operation
import org.springframework.web.bind.annotation.{GetMapping, RequestMapping, RestController}

@RequestMapping(value = Array("/api/game"))
@RestController
class GameController {

  @Operation("1 Start a new game.")
  @GetMapping(Array("/"))
  def newGame(): Game = Game.newGame
}
