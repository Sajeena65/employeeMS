/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sajeena.employeeMS.dao;

import com.sajeena.employeeMS.entity.Employee;

/**
 *
 * @author Admin
 */
public interface employeeDAO {
     boolean insert(Employee e);
    boolean delete(int id);
    Employee getbyId(int id);
    Employee[] getAll();
    
}
