package com.svlada.controllers;

import com.svlada.entity.Hero;
import com.svlada.services.HeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by dsarmiento on 05/04/2017.
 */
@RestController
public class HeroController {
    @Autowired
    private HeroService heroService;

    @SuppressWarnings("unchecked")
    @RequestMapping(value = "/heroes", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Hero> userInfo() throws Exception {
        return (List<Hero>) heroService.getHeroes();
    }
    @RequestMapping(value = "/heroes/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Hero userInfo(@PathVariable("id") Long id) throws Exception {
        return heroService.getHero(id);
    }

    @RequestMapping(value = "/heroes", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public Integer createUser(@RequestBody Hero hero) throws Exception {
        return (Integer) heroService.createHeroe(hero);
    }

    @RequestMapping(value = "/heroes", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
    public Integer updateUser(@RequestBody Hero hero) throws Exception {
        return (Integer) heroService.updateHeroe(hero);
    }

    @RequestMapping(value = "/heroes/{id}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Integer deleteUser(@PathVariable Long id) throws Exception {
        return (Integer) heroService.deleteHeroe(id);
    }


    /*private ResponseObject getResponseObject(Integer output){
        return new ResponseObject(output == 1 ? true : false, output == 1 ? "successful" : "failed");
    }*/
}
