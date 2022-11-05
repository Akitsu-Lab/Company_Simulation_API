package com.akitsulab.company_simulation_api.repository;

import com.akitsulab.company_simulation_api.domain.Employee;

import java.util.List;

public interface EmployeeRepository {
    List<Employee> findList();
    Employee findOne(long id);
    Employee lock(long id);
}
