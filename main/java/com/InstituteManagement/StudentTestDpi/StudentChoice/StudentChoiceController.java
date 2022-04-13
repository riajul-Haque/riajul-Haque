package com.InstituteManagement.StudentTestDpi.StudentChoice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(path = "dpi/v1/student")
public class StudentChoiceController {

    private final StudentChoiceService studentChoiceService;

    @Autowired
    public StudentChoiceController(StudentChoiceService studentChoiceService) {
        this.studentChoiceService = studentChoiceService;
    }

    @GetMapping(path = "/home")
    public ResponseEntity<String> homePage() {
        return new ResponseEntity<>(
                studentChoiceService.Greetings(),
                HttpStatus.OK
        );
    }
}
