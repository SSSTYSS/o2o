package com.sty.o2o.dao;

import com.sty.o2o.entity.Emp;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @ClassName EmpDao
 * @Description TODO
 * @Author sty
 * @Date 2020/1/9 12:59
 * @Version 1.0
 **/
@Repository
public interface EmpDao {

    /**
     * description: findAllEmp 查询所有员工信息<br>
     * version: 1.0 <br>
     * date: 2020/1/9 13:00 <br>
     * author: sty <br>
     * @param
     * @return java.util.List<com.sty.o2o.entity.Emp>
    */
    public List<Emp> findAllEmp();

    /**
     * description: deleteEmp 根据ID删除员工信息<br>
     * version: 1.0 <br>
     * date: 2020/1/9 13:00 <br>
     * author: sty <br>
     * @param empno
     * @return java.lang.String
    */
    public String deleteEmp(String empno);

    /**
     * description: 根据ID查询要修改的员工信息 <br>
     * version: 1.0 <br>
     * date: 2020/1/9 13:01 <br>
     * author: sty <br>
     * @param empno
     * @return java.util.List<com.sty.o2o.entity.Emp>
    */
    public List<Emp> toUpdate(String empno);

    /**
     * description: insertEmp 添加员工信息<br>
     * version: 1.0 <br>
     * date: 2020/1/9 13:01 <br>
     * author: sty <br>
     * @param emp
     * @return java.lang.String
    */
    public String insertEmp(Emp emp);

    /**
     * description: updateEmp 修改员工信息<br>
     * version: 1.0 <br>
     * date: 2020/1/9 13:01 <br>
     * author: sty <br>
     * @param emp
     * @return java.lang.String
    */
    public String updateEmp(Emp emp);

    /**
     * description: findAllEmp1 <br>
     * version: 1.0 <br>
     * date: 2020/1/9 17:13 <br>
     * author: sty <br>
     * @param
     * @return java.util.List<com.sty.o2o.entity.Emp>
    */
    public String findAllEmp1();
}
