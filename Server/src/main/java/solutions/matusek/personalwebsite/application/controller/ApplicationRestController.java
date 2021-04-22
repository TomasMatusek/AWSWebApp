package solutions.matusek.personalwebsite.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import solutions.matusek.personalwebsite.application.service.IApplicationService;

@RestController
public class ApplicationRestController implements IApplicationRestController {

    IApplicationService applicationService;

    @Autowired
    public ApplicationRestController(IApplicationService applicationService) {
        this.applicationService = applicationService;
    }

    @Override
    @GetMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> getRoot() {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body("{}");
    }

    @Override
    @GetMapping(value = "/version", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ApplicationVersionDTO> getVersion() {
        ApplicationVersionDTO response = new ApplicationVersionDTO(
                applicationService.getVersion(),
                applicationService.getGroupId(),
                applicationService.getArtifactId()
        );

        return ResponseEntity
                .status(HttpStatus.OK)
                .body(response);
    }
}