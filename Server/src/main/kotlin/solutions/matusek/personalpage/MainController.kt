package solutions.matusek.personalpage

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class MainController {

    @GetMapping("/test")
    fun root(): String {
        return "{test}";
    }
}