package com.hbc.edd.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@RestController
@EnableSwagger2
@RequestMapping("/api/v1")
public class EDDController {

    @GetMapping("/hello")
    @ApiOperation(value = "Hello API")
    public ResponseEntity<String> getEdd() {
        return ResponseEntity.ok().body("Hello world this is new image ");
    }

}
