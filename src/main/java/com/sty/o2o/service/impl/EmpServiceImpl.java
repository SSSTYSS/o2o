package com.sty.o2o.service.impl;

import com.sty.o2o.dao.EmpDao;
import com.sty.o2o.entity.Emp;
import com.sty.o2o.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class EmpServiceImpl implements EmpService {

    /**  通过构造器注入---begin  **/
    @Autowired
    private EmpDao dao;

    public List<Emp> findAllEmp() {
        return  dao.findAllEmp();
    }

    public String deleteEmp(String empno) {
        return dao.deleteEmp(empno);
    }

    public List<Emp> toUpdate(String empno) {
        return  dao.toUpdate(empno);
    }

    public String insertEmp(Emp emp) {
        return dao.insertEmp(emp);
    }

    public String updateEmp(Emp emp) {
        return dao.updateEmp(emp);
    }

    public String findAllEmp1() {
        return  dao.findAllEmp1();
    }

}
