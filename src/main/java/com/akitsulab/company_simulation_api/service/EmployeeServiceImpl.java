package com.akitsulab.company_simulation_api.service;

import com.akitsulab.company_simulation_api.domain.Employee;
import com.akitsulab.company_simulation_api.domain.EmployeeList;
import com.akitsulab.company_simulation_api.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    private final EmployeeRepository repository;

    public EmployeeServiceImpl(EmployeeRepository repository) {
        this.repository = repository;
    }

    @Override
    public EmployeeList find() {
        EmployeeList employeeList = new EmployeeList();
        employeeList.setEmployeeList(this.repository.findList());
        return employeeList;
    }

    @Override
    public Employee get(int employeeId) {
        return this.repository.findOne(employeeId);
    }
}
