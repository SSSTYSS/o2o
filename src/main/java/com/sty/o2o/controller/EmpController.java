package com.sty.o2o.controller;

import com.alibaba.fastjson.JSON;
import com.sty.o2o.entity.Emp;
import com.sty.o2o.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/o2o")
public class EmpController {
    @Autowired
    private EmpService ser;

    @ResponseBody
    @RequestMapping("/findallemp")
    public String findAllEmp(){
        List<Emp> list = ser.findAllEmp();
        return JSON.toJSONString(list);
    }

    @ResponseBody
    @RequestMapping("/findallemp1")
    public String findAllEmp1(){
        return ser.findAllEmp1();
    }

    @ResponseBody
    @RequestMapping("/deleteemp")
    public String deleteEmp(String empno){
        return ser.deleteEmp(empno);
    }

    @ResponseBody
    @RequestMapping("/toupdate")
    public String toUpdate(String empno){
        if(empno!=null){
            List<Emp> list = ser.toUpdate(empno);
            return JSON.toJSONString(list);
        }
        return "false";
    }

    @ResponseBody
    @RequestMapping("/insertorupdateemp")
    public String InsertOrUpdateEmp(Emp emp){
        if (emp.getEmpno()!=null){
            return ser.updateEmp(emp);
        }else{
            return ser.insertEmp(emp);
        }
    }
}
