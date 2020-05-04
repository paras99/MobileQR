package com.MobileQR.controller;

import com.MobileQR.model.MobileModel;
import com.MobileQR.service.ModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/home")
public class MobileController {

    @Autowired
    ModelService modelService;

    @GetMapping(value="/productId/{pid}")
    public ResponseEntity <MobileModel> getProduct(@PathVariable int pid) {
        MobileModel mobileModel = modelService.getProduct(pid);
        if (mobileModel == null) {
            return new ResponseEntity("Product Not Found", HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity<>(mobileModel, HttpStatus.OK);
        }

    }
}
