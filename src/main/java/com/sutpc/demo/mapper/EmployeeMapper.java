package com.sutpc.demo.mapper;

import com.sutpc.demo.bean.Employee;

/**
 * @author ZhangJincheng
 * @date 2018-7-24 9:43
 */
public interface EmployeeMapper {

    public Employee getEmpById(Integer id);

    public void insertEmp(Employee employee);
}
