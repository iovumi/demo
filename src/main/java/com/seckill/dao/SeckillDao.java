package com.seckill.dao;

import com.seckill.entity.Seckill;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

/**
 * Created by lsy on 2017/5/17.
 */
public interface SeckillDao {

    int reduceNumber(@Param("seckillId") long seckillId,@Param("killTime")Date killTime);

    Seckill queryById(long seckillId);

    List<Seckill> queryAll(@Param("offset") int offset,@Param("limit") int limit);

}
