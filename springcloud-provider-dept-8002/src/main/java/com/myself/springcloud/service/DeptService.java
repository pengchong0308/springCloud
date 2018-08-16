package com.myself.springcloud.service;

import com.myself.springcloud.entity.Dept;

import java.util.List;

/**
 * @author pengChong
 * @create 2018/8/10 - 0:32
 */
public interface DeptService {
    public boolean add(Dept dept);
    public Dept    get(Long id);
    public List<Dept> list();
}
