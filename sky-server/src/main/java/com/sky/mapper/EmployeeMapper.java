package com.sky.mapper;

import com.sky.entity.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import com.github.pagehelper.Page;

@Mapper
public interface EmployeeMapper {

    /**
     * 根据用户名查询员工
     * @param username
     * @return
     */
    @Select("select * from employee where username = #{username}")
    Employee getByUsername(String username);

    /**
     * 插入员工数据
     * @param employee
     * @return
     */
    boolean insert(Employee employee);

    /**
     * 员工分页查询
     * @param name
     * @return
     */
    Page<Employee> pageQuery(String name);
}
