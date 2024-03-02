package tn.esprit.rh.achat.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DockerController {

    @PostMapping("/create-docker-image")
    public String createDockerImage() {
        // Logic to create Docker image
        return "Docker image creation initiated successfully.";
    }
}