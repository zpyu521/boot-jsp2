package com.zpyu.bootjsp2.controller;

import com.zpyu.bootjsp2.dao.DeptMapper;
import com.zpyu.bootjsp2.entity.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Author: zpyu521
 * @Date: 2019/9/19
 * @Description:
 * @Version: 1.0
 */
@Controller
@RequestMapping("")
public class DeptController {
    @Autowired
    private DeptMapper deptMapper;

    @RequestMapping("find")
    public String getDept(Model model) {
        List<Dept> depts = deptMapper.find();
        System.out.println(depts.toString());
        model.addAttribute("deptList",depts);
        return "index";
    }

}
