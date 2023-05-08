package com.nttdata.bootcamp.retoconfigservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RetoConfigController {
	
	@Value("${reto-config-service.reto}")
    private String myProduct;
    
    @GetMapping(path="/getMensaje")
    public String myProduct() {
   	 return this.myProduct;
    }

}
