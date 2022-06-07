package com.t4k.techscoutapi.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("/file")
class FileController {

    @PostMapping("/match-video")
    fun postMatchVideo() {

    }
}