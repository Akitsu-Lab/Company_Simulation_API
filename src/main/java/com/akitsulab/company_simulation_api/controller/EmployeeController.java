package com.akitsulab.company_simulation_api.controller;

import com.akitsulab.company_simulation_api.domain.Employee;
import com.akitsulab.company_simulation_api.domain.EmployeeList;
import com.akitsulab.company_simulation_api.service.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("services/v1/employee")
public class EmployeeController {
    private final EmployeeService service;

    public EmployeeController(EmployeeService service) {
        this.service = service;
    }
    @GetMapping(path = "", produces = "application/json")
    public EmployeeList find(){
        return this.service.find();
    }

    @GetMapping(path = "/{employeeId}",produces = "application/json")
    public Employee get(@PathVariable int employeeId){
        return this.service.get(employeeId);
    }

}
