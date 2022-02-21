package com.qf.j2112.controller;

import com.qf.j2112.po.Dept;
import com.qf.j2112.service.DeptService;
import com.qf.j2112.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @PACKAGE_NAME: com.qf.j2112.controller
 * @NAME: DeptController
 * @USER: ☆森☆
 * @CreateTime: 2022-02-18  19:03
 * @PROJECT_NAME: j2112-ssm01
 */
@RestController
public class DeptController {
    @Autowired
    private DeptService service;
    @RequestMapping(value = "/path",method = RequestMethod.GET)
    public List<Dept> list(Model model){
        List<Dept> list = service.findAll();
        model.addAttribute("list",list);
        return list;
    }

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public Dept add(@RequestBody Dept dept){
        Dept dept1 = service.addDept(dept);
        return dept1;
    }
    @RequestMapping(value = "/update",method = RequestMethod.PUT)
    public Dept update(@RequestBody Dept dept){
        Dept dept1 = service.updateDept(dept);
        return dept1;
    }

    @RequestMapping(value = "/del/{id}",method = RequestMethod.DELETE)
    public Result delete(@PathVariable("id") int id){
        boolean b = service.delDept(id);
        Result result = new Result();
        if(b){
          result.setCode(200);
          result.setMsg("ok");
        }
        return result;
    }
}
