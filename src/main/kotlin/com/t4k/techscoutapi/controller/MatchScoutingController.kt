package com.t4k.techscoutapi.controller

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("/match")
class MatchScoutingController {

    @GetMapping("/hello")
    fun getHello(): ResponseEntity<String> {
        return ResponseEntity("Hello", HttpStatus.OK)
    }

}