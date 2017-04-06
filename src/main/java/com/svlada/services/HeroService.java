package com.svlada.services;

import com.svlada.entity.Hero;

import java.util.List;

/**
 * Created by dsarmiento on 05/04/2017.
 */
public interface HeroService {
    public List<Hero> getHeroes(String name);
    public Hero getHero(Long id);
    public Integer createHeroe(Hero hero);
    public Integer updateHeroe(Hero hero);
    public Integer deleteHeroe(Long id);
    public List<Hero> getSecretHeroes();
}
