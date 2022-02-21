package com.qf.j2112.service;

import com.qf.j2112.po.Dept;

import java.util.List;

public interface DeptService {
    /**
     * 查所有
     * @return
     */
    List<Dept> findAll();

    Dept addDept(Dept dept);

    Dept updateDept(Dept dept);

    boolean delDept(int id);
}
