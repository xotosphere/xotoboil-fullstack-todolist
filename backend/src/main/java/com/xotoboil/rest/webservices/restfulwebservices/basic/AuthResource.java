package com.xotoboil.rest.webservices.restfulwebservices.basic;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthResource {
        @GetMapping(path = "/basicauth")
        public String basicAuthCheck() {
            return "Success";
        }
}
