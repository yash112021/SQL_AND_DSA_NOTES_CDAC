package com.demo.dao;

import java.util.List;

import com.demo.beans.Employee;
import com.demo.beans.Project;

public interface EmployeeDao {

	boolean save(Employee e);

	List<Employee> findAllEmp();

	boolean removeById(int id);

	boolean modifyById(int eid, String ename, double sal);

	Employee findById(int eid);

	boolean addProjectToEmployee(Employee e, Project p);

	List<Employee> sortBySal();

	void closeRes();



}
