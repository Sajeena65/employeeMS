/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sajeena.employeeMS.dao.impl;

import com.sajeena.employeeMS.dao.employeeDAO;
import com.sajeena.employeeMS.entity.Employee;

/**
 *
 * @author Admin
 */
public class employeeDAOImpl implements employeeDAO {

    private int count = 0;
    private Employee[] Employeelist = new Employee[10];

    @Override
    public boolean insert(Employee e) {
        if (count == Employeelist.length) {
            return false;
        }
        Employeelist[count] = e;
        count++;
        return true;
    }

    @Override
    public boolean delete(int id) {
        for (int i = 0; i < Employeelist.length; i++) {
            Employee c = Employeelist[i];
            if (c != null && c.getId() == id) {
                Employeelist[i] = null;
                return true;
            }
        }
        return false;
    }

    @Override
    public Employee getbyId(int id) {
        for (int i = 0; i < Employeelist.length; i++) {
            Employee c = Employeelist[i];
            if (c != null && c.getId() == id) {

                return c;
            }
        }
        return null;
    }

    @Override
    public Employee[] getAll() {
        return Employeelist;

    }

}
