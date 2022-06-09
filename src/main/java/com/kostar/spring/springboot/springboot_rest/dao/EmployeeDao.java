package com.kostar.spring.springboot.springboot_rest.dao;




import com.kostar.spring.springboot.springboot_rest.entity.Employee;

import java.util.List;

public interface EmployeeDao {

    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);

    Employee getEmployee(int id);

    public void deleteEmployee(int id);

}

