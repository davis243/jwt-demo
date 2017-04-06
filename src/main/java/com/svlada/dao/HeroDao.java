package com.svlada.dao;

import com.svlada.entity.Hero;

import java.util.List;

/**
 * Created by dsarmiento on 05/04/2017.
 */
public interface HeroDao {
    public List<Hero> getHeroes();
    public Hero getHero(Long id);
    public Integer createHeroe(Hero hero);
    public Integer updateHeroe(Hero hero);
    public Integer deleteHeroe(Long id);
}
