package com.hypeone.logmonitoring.web.controller;


import com.hypeone.logmonitoring.services.ServiceStatusService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;

@Controller
@RequestMapping(value = "/service-status")
public class ServiceStatusController {

    final
    ServiceStatusService service;

    public ServiceStatusController(ServiceStatusService service) {
        this.service = service;
    }

    @PostMapping(value = "/post")
    public ResponseEntity<Object> getStatusService() throws IOException {
        return ResponseEntity.ok().body(service.getServiceStatus());
    }
}
