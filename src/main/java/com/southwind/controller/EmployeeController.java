package com.southwind.controller;

import com.southwind.entity.Employee;
import com.southwind.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
@Controller
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    /**
     * 查询所有员工
     * @return
     */
    @RequestMapping(value="/queryAll")
    public ModelAndView test(){
        System.out.println("请求进来了");
        List<Employee> list = employeeService.queryAll();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        modelAndView.addObject("list", list);
        return modelAndView;
    }
}
