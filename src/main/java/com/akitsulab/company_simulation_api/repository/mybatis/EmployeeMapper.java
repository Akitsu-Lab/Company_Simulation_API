package com.akitsulab.company_simulation_api.repository.mybatis;

import com.akitsulab.company_simulation_api.domain.Employee;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EmployeeMapper {
    List<Employee> find();
}
