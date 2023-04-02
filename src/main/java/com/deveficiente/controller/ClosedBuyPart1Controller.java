package com.deveficiente.controller;

import com.deveficiente.entity.dto.NewBuyDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClosedBuyPart1Controller {


    @PostMapping("/compras")
    NewBuyDTO saveCriar(@RequestBody NewBuyDTO request){
        return null;
    }

}
