package com.kostar.spring.springboot.springboot_rest.controller;
import com.kostar.spring.springboot.springboot_rest.entity.Employee;
import com.kostar.spring.springboot.springboot_rest.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MyRESTController {

    @Autowired
    EmployeeService employeeService;


    @GetMapping("/employees")
    public List<Employee> showAllEmployees() {


        List<Employee> allEmloyees = employeeService.getAllEmployees();
        return allEmloyees;

    }

    @GetMapping("/employees/{id}")
    public Employee getEmployee(@PathVariable int id) {

        Employee employee = employeeService.getEmployee(id);


        return employee;

    }


    @PostMapping("/employees")
    public Employee addNewEmployee(@RequestBody Employee employee) {
        employeeService.saveEmployee(employee);
        return employee;

    }


    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee employee) {
        employeeService.saveEmployee(employee);
        return employee;

    }

    @DeleteMapping("/employees/{id}")
    public String deleteEmployee(@PathVariable int id) {


        Employee employee = employeeService.getEmployee(id);

        employeeService.deleteEmployee(id);
        return "Employee id " + id + " was deleted";
    }


}
