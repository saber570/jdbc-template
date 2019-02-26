package com.saber.jdbctemplate.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping(value = "/api/test", produces = {MediaType.APPLICATION_JSON_VALUE})
public class TestController {

  @GetMapping(value = "/test")
  public String test() throws Exception {
    return null;
  }
}
