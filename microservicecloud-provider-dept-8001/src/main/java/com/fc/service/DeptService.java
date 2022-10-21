package com.fc.service;

import com.fc.springcloud.entity.Dept;

import java.util.List;

public interface DeptService {
    public Boolean addDept(Dept dept);
    public Dept findById(Long id);
    public List<Dept> findAll();
}
