package com.myself.springcloud.controller;

import com.myself.springcloud.entity.Dept;
import com.myself.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author pengChong
 * @create 2018/8/10 - 0:38
 */
@RestController
public class DeptController {
    @Autowired
    private DeptService service;
    @Autowired
    private DiscoveryClient client;

    @RequestMapping(value = "/dept/add",method = RequestMethod.POST)
    public boolean add(@RequestBody Dept dept){
        return service.add(dept);
    }

    @RequestMapping(value = "/dept/get/{id}",method = RequestMethod.GET)
    public Dept get(@PathVariable("id") Long id){
        return service.get(id);
    }

    @RequestMapping(value = "/dept/list",method = RequestMethod.GET)
    public List<Dept> get(){
        return service.list();
    }
}
