package com.deveficiente.service;

import com.deveficiente.entity.Country;
import com.deveficiente.entity.State;
import com.deveficiente.entity.dto.CountryDTO;
import com.deveficiente.entity.dto.StateDTO;
import com.deveficiente.mapper.CountryMapper;
import com.deveficiente.mapper.StateMapper;
import com.deveficiente.repository.CountryRepositoy;
import com.deveficiente.repository.StateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {

    @Autowired
    private CountryRepositoy countryRepositoy;
    @Autowired
    private StateRepository stateRepository;
    @Autowired
    private CountryMapper countryMapper;
    @Autowired
    private StateMapper stateMapper;


    public Country saveCountry(CountryDTO countryDTO) {
        Country country = countryMapper.toDomain(countryDTO);
        return countryRepositoy.save(country);
    }

    public State saveState(StateDTO stateDTO) throws Exception {
        Country country = countryRepositoy.findById(stateDTO.getCountryId()).orElseThrow(() -> new Exception("Não existe esse pais."));
        State state = stateMapper.toDomain(stateDTO);
        state.setCountry(country);
        return stateRepository.save(state);
    }


    public List<State> findAllState() {
        return stateRepository.findAll();
    }


    public List<Country> findAllCountry() {
        return countryRepositoy.findAll();
    }
}
