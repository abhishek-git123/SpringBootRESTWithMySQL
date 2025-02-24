package com.javaguides.springboot.service;

import com.javaguides.springboot.entity.Address;
import com.javaguides.springboot.entity.Employee;
import com.javaguides.springboot.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;
    @Autowired
    private AddressService addressService;

    @Transactional
    public Employee addEmployee(Employee employee) throws Exception{
        Employee employeeSavedToDB = this.employeeRepository.save(employee);

        Address address = new Address();
       // address.setId(234);
        address.setAddress("Melbourne");
        address.setEmployee(employee);

        this.addressService.addAddress(address);
        return employeeSavedToDB;
    }
}
