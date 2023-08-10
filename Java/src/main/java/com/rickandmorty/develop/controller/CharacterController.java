package com.rickandmorty.develop.controller;

import com.rickandmorty.develop.model.Character;
import com.rickandmorty.develop.model.Result;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class CharacterController {

    @RequestMapping(value = "/getAll")
    public ResponseEntity<List<Character>> getAll() {
        String uri = "https://rickandmortyapi.com/api/character";
        RestTemplate restTemplate = new RestTemplate();
        Result result = restTemplate.getForObject(uri, Result.class);
        return new ResponseEntity<>(result.getResults(), HttpStatus.OK);
    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public ResponseEntity<Object> insertCharacter(@RequestBody Character character) {
        //Pendiente
        return new ResponseEntity<>("Character is created successsfully", HttpStatus.OK);
    }

    @RequestMapping(value = "getByParams", method = RequestMethod.POST)
    public ResponseEntity<List<Object>> getByParams(@RequestBody Character character){
        //Pendiente
        return new ResponseEntity<>(null, HttpStatus.OK);
    }


}
