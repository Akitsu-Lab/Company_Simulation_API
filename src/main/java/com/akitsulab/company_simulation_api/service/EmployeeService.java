package com.akitsulab.company_simulation_api.service;

import com.akitsulab.company_simulation_api.domain.Employee;
import com.akitsulab.company_simulation_api.domain.EmployeeList;

public interface EmployeeService {
    EmployeeList find();
    Employee get(int employeeId);
}
