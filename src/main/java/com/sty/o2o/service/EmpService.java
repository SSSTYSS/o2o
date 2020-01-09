package com.sty.o2o.service;

import com.sty.o2o.entity.Emp;


import java.util.List;

public interface EmpService {

    /**
     * description: findAllEmp 查询所有员工信息<br>
     * version: 1.0 <br>
     * date: 2020/1/9 12:54 <br>
     * author: sty <br>
     * @param
     * @return java.util.List<com.sty.o2o.entity.Emp>
    */
    public List<Emp> findAllEmp();

    /**
     * description: deleteEmp 根据ID删除员工信息<br>
     * version: 1.0 <br>
     * date: 2020/1/9 12:43 <br>
     * author: sty <br>
     * @param empno 用户id
     * @return java.lang.String
    */
    public String deleteEmp(String empno);

    /**
     * description: toUpdate 根据ID查询要修改的员工信息 <br>
     * version: 1.0 <br>
     * date: 2020/1/9 12:55 <br>
     * author: sty <br>
     * @param empno
     * @return java.util.List<com.sty.o2o.entity.Emp>
    */
    public List<Emp> toUpdate(String empno);

    /**
     * description: insertEmp 添加员工信息<br>
     * version: 1.0 <br>
     * date: 2020/1/9 12:55 <br>
     * author: sty <br>
     * @param emp
     * @return java.lang.String
    */
    public String insertEmp(Emp emp);

    /**
     * description: updateEmp 修改员工信息br>
     * version: 1.0 <br>
     * date: 2020/1/9 12:55 <br>
     * author: sty <br>
     * @param emp
     * @return java.lang.String
    */
    public String updateEmp(Emp emp);

    /**
     * description: findAllEmp1 查询所有员工信息<br>
     * version: 1.0 <br>
     * date: 2020/1/9 12:54 <br>
     * author: sty <br>
     * @param
     * @return java.util.List<com.sty.o2o.entity.Emp>
     */
    public String findAllEmp1();
}
