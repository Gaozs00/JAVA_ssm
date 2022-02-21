package com.qf.j2112.mapper;

import com.qf.j2112.po.Dept;

import java.util.List;

/**
 * @PACKAGE_NAME: com.qf.j2112.mapper
 * @NAME: DeptMapper
 * @USER: ☆森☆
 * @CreateTime: 2022-02-18  17:46
 * @PROJECT_NAME: j2112-ssm01
 */
public interface DeptMapper {
    List<Dept> findDepts();

    int addDept(Dept dept);

    int updateDept(Dept dept);

    int deleteDept(int id);
}
