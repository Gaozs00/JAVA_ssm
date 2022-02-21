package com.qf.j2112.service.impl;

import com.qf.j2112.mapper.DeptMapper;
import com.qf.j2112.po.Dept;
import com.qf.j2112.service.DeptService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @PACKAGE_NAME: com.qf.j2112.service.impl
 * @NAME: DtptServiceImpl
 * @USER: ☆森☆
 * @CreateTime: 2022-02-18  17:51
 * @PROJECT_NAME: j2112-ssm01
 */
@Service
public class DeptServiceImpl implements DeptService {
    @Resource
    private DeptMapper mapper;
    @Override
    public List<Dept> findAll() {
        return mapper.findDepts();
    }

    @Override
    public Dept addDept(Dept dept) {
        int res = mapper.addDept(dept);
        if(res>0)
            return dept;
        return null;
    }

    @Override
    public Dept updateDept(Dept dept) {
        int i = mapper.updateDept(dept);
        if(i>0)return dept;
        return null;
    }

    @Override
    public boolean delDept(int id) {
      int i =  mapper.deleteDept(id);
      if(i>0)return true;
        return false;
    }

//
}
