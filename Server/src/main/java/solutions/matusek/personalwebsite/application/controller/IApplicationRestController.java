package solutions.matusek.personalwebsite.application.controller;

import org.springframework.http.ResponseEntity;

public interface IApplicationRestController {
    ResponseEntity<String> getRoot();
    ResponseEntity<ApplicationVersionDTO> getVersion();
}
