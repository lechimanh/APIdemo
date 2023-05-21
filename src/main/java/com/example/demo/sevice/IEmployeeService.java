package com.example.demo.sevice;

import com.example.demo.model.Employee;

import java.util.List;

public interface IEmployeeService {
    //Them nhan vien
    public Employee addEmplyee(Employee employee) ;

    //Chinh sua thong tin nha vien
    public Employee updateEmployee(long id, Employee employee);

    //Xoa nhan vien
    public boolean deleteEmployee(long id);

    //Lay ra danh sach nhan vien
    public List<Employee> getAllEmployee();

    //Lay ra 1 nhan vien
    public Employee getOneEmployee(long id);
}
