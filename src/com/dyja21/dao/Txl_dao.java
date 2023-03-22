package com.dyja21.dao;

import com.dyja21.entity.Ren;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Map;

@Repository
public class Txl_dao implements ITxl_dao {
    //    @Autowired
//    private JTemplwhl jTemplwhl;
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Map<String, Object> zj(Ren ren) {
        System.out.println("==da--o--l--e" + ren.getXma());
//        String sk = "insert into txl(bh,xm,dh)values ('" + ren.getBha() + "','" + ren.getXma() + "','" + ren.getDha() + "')";
//        jTemplwhl.updatea(sk);
//        jdbcTemplate.update(sk);
        jdbcTemplate.update("insert  into txl (bh,xm,dh) values (?,?,?)",new Object[]{ren.getBha(),ren.getXma(),ren.getDha()});
        return null;
    }


}
