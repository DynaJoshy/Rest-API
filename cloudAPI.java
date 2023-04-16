package com.demo_app.rest_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//controller class
@RestController
// annotation for path using cloudvendor
@RequestMapping("/cloudvendor")
public class cloudAPI {
    // cloudvendor CV1 = new cloudvendor();

    // creating a model class (cloud vendor) which returns objects ie the string of
    // details
    @GetMapping("/{vendor_id}") // a get mapping annotation for the spring to get the details
    public cloudvendor getcloudvendordetails(String vendor_id) {
        return new cloudvendor("c1", "Riya", "98765XXXX");

    }
}