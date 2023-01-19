package com.deveficiente.controller;

import com.deveficiente.config.HandleValidationExceptions;
import com.deveficiente.entity.Country;
import com.deveficiente.entity.State;
import com.deveficiente.entity.dto.CountryDTO;
import com.deveficiente.entity.dto.StateDTO;
import com.deveficiente.service.CountryService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
 class CountryController extends HandleValidationExceptions {

    @Autowired
  private CountryService countryService;

    @PostMapping("/country")
    Country getCountry(@RequestBody @Valid CountryDTO countryDTO) {
        return countryService.saveCountry(countryDTO);
    }

    @PostMapping("/state")
    State saveState(@RequestBody @Valid StateDTO stateDTO) throws Exception {
        return countryService.saveState(stateDTO);
    }


    @GetMapping("/state")
    List<State> getState() {
        return countryService.findAllState();
    }

    @GetMapping("/country")
    List<Country> getCountry() {
        return countryService.findAllCountry();
    }

}
