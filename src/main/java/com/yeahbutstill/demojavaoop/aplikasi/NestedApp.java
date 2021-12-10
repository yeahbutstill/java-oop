package com.yeahbutstill.demojavaoop.aplikasi;

import com.yeahbutstill.demojavaoop.innerclasss.Company;

public class NestedApp {
    public static void main(String[] args) {

        Company company = new Company();
        company.setName("Dani Setiawan");

        Company.Employee employee = company.new Employee();
        employee.setName("Maya Triyanti");

        System.out.println(company);
        System.out.println(employee);
        System.out.println(employee.getName());
        System.out.println(employee.getCompany());

        Company company1 = new Company();
        company1.setName("Belum Nemu");

        Company.Employee employee1 = company1.new Employee();
        employee1.setName("Budi");

        System.out.println(employee1.getCompany());
        System.out.println(employee1.getName());
    }
}
