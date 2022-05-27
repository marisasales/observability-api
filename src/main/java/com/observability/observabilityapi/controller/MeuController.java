package com.observability.observabilityapi.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/meu-controller")
public class MeuController {

  @GetMapping
  public ResponseEntity<String> greeting() {
    return ResponseEntity.ok("Sucesso");
  }
}
