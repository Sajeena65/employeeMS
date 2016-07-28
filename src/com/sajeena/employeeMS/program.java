/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sajeena.employeeMS;

import com.sajeena.employeeMS.dao.employeeDAO;
import com.sajeena.employeeMS.dao.impl.employeeDAOImpl;
import com.sajeena.employeeMS.entity.Employee;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        employeeDAO employeedao = new employeeDAOImpl();
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("1.Enter employee detail:");
            System.out.println("2.Delete record:");
            System.out.println("3.Show all:");
            System.out.println("4.Search by Id:");
            System.out.println("5.Exit");
            System.out.println("Enter your choice [1-5]:");
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter Employee detail:");
                    Employee c = new Employee();
                    System.out.println("Enter Employee ID: ");
                    c.setId(input.nextInt());
                    System.out.println("Enter Employee Name: ");
                    c.setEmployeename(input.next());

                    System.out.println("Enter company name : ");
                    c.setCompany(input.next());

                    System.out.println("Enter post of Employee:");
                    c.setPost(input.next());
                    System.out.println("Enter Salary: ");
                    c.setSalary(input.nextInt());

                    System.out.println("Enter Status: ");
                    c.setStatus(input.nextBoolean());
                    if (employeedao.insert(c)) {
                        System.out.println("Inserted successfully");

                    } else {
                        System.out.println("Data Full");
                    }
                    break;
                case 2:
                    System.out.println("Enter the Id to delete: ");
                    int id = input.nextInt();
                    if (employeedao.delete(id)) {
                        System.out.println("Id No " + id + " is deleted successfully.");
                    } else {
                        System.out.println("Id not found.");
                    }

                    break;
                case 3:
                    System.out.println("Listing all Employees:");
                    Employee[] em = employeedao.getAll();
                    for (int i = 0; i < em.length; i++) {
                        Employee a = em[i];
                        if (a != null) {
                            System.out.println("Id:" + a.getId());
                            System.out.println("Name:" + a.getEmployeename());
                            System.out.println("Company:" + a.getCompany());
                            System.out.println("Post:" + a.getPost());
                            System.out.println("Salary:" + a.getSalary());
                            System.out.println("Status:" + a.isStatus());

                        }
                    }
                    break;
                case 4:
                    System.out.println("Enter Id of Employee:");
                    int a = input.nextInt();
                    Employee x = employeedao.getbyId(a);
                    if(x!=null){
                    System.out.println("Id:" + x.getId());
                    System.out.println("Name:" + x.getEmployeename());
                    System.out.println("Company:" + x.getCompany());
                    System.out.println("Post:" + x.getPost());
                    System.out.println("Salary:" + x.getSalary());
                    System.out.println("Status:" + x.isStatus());
                    }else
                    System.out.println("Employee could not be found.");
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
        }
    }

}
