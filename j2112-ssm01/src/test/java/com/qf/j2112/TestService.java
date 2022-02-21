package com.qf.j2112;

import com.qf.j2112.mapper.DeptMapper;
import com.qf.j2112.po.Dept;
import com.qf.j2112.service.DeptService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.annotation.Resource;
import java.util.List;

/**
 * @PACKAGE_NAME: com.qf.j2112
 * @NAME: TestService
 * @USER: ☆森☆
 * @CreateTime: 2022-02-18  17:54
 * @PROJECT_NAME: j2112-ssm01
 */
public class TestService {

    @Test
    public void testFindAll(){
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("spring-mybatis.xml");
        DeptMapper mapper = ac.getBean(DeptMapper.class);
        List<Dept> all = mapper.findDepts();
        for (Dept dept : all) {
            System.out.println(dept);
        }
    }
}
