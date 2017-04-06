package com.svlada.dao.impl;

import com.svlada.dao.HeroDao;
import com.svlada.entity.Hero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.stereotype.Repository;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by dsarmiento on 05/04/2017.
 */
@Repository
public class HeroDaoImpl implements HeroDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Hero> getHeroes() {
        return jdbcTemplate.query(
                "SELECT id,name,secreto FROM hero",
                (rs, rowNum) -> new Hero(rs.getLong("id"),rs.getString("name"),rs.getBoolean("secreto")));

    }

    @Override
    public Hero getHero(Long id) {
        return ((List<Hero>) jdbcTemplate.query(
                "SELECT id,name,secreto FROM hero where id = ?",
                new Object[] { id },
                (rs, rowNum) -> new Hero(rs.getLong("id"),rs.getString("name"),rs.getBoolean("secreto")))).get(0);
    }

    @Override
    public Integer createHeroe(Hero hero) {
        return jdbcTemplate.update("INSERT INTO hero(name, secreto) VALUES (?,?)",
                        new PreparedStatementSetter() {
                            public void setValues(PreparedStatement stmt)
                                    throws SQLException {
                                stmt.setString(1, hero.getName());
                                stmt.setBoolean(2, hero.getSecreto());

                            }
                        });
    }

    @Override
    public Integer updateHeroe(Hero hero) {
        return jdbcTemplate.update("UPDATE users set name=?,secreto=? where id=?",
                new PreparedStatementSetter() {
                    public void setValues(PreparedStatement stmt)
                            throws SQLException {
                        stmt.setString(1, hero.getName());
                        stmt.setBoolean(2, hero.getSecreto());
                        stmt.setLong(3,hero.getId());
                    }
                });
    }

    @Override
    public Integer deleteHeroe(Long id) {
        return jdbcTemplate.update("DELETE hero where id=?",
                new PreparedStatementSetter() {
                    public void setValues(PreparedStatement stmt)
                            throws SQLException {
                        stmt.setLong(1,id);
                    }
                });
    }
}
