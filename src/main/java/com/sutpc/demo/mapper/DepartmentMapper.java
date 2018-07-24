package com.sutpc.demo.mapper;

import com.sutpc.demo.bean.Department;
import org.apache.ibatis.annotations.*;

/**
 * @author ZhangJincheng
 * @date 2018-7-24 9:43
 * Mapper指定这是一个操作数据库的mapper
 */
//@Mapper
public interface DepartmentMapper {

    @Select("select * from department where id=#{id}")
    public Department getDeptById(Integer id);

    @Delete("delete from department where id=#{id}")
    public int deleteDepptById(Integer id);

    @Options(useGeneratedKeys = true,keyProperty = "id")//封装主键。主键自增长
    @Insert("insert into department(departmentName) values(#{departmentName})")
    public int insertDept(Department department);

    @Update("update department set departmentName=#{departmentName} where id=#{id}")
    public int updateDept(Department department);
}
