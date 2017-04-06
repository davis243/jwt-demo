package com.svlada.services.impl;

import com.svlada.dao.HeroDao;
import com.svlada.entity.Hero;
import com.svlada.services.HeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by dsarmiento on 05/04/2017.
 */
@Service
public class HeroServiceImpl implements HeroService{

    @Autowired
    HeroDao heroDao;

    @Override
    public List<Hero> getHeroes(String name) {
        return heroDao.getHeroes(name);
    }

    @Override
    public Hero getHero(Long id) {
        return heroDao.getHero(id);
    }

    @Override
    public Integer createHeroe(Hero hero) {
        return heroDao.createHeroe(hero);
    }

    @Override
    public Integer updateHeroe(Hero hero) {
        return heroDao.updateHeroe(hero);
    }

    @Override
    public Integer deleteHeroe(Long id) {
        return heroDao.deleteHeroe(id);
    }

    @Override
    public List<Hero> getSecretHeroes() {
        return heroDao.getSecretHeroes();
    }
}
