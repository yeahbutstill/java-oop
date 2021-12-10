package com.yeahbutstill.demojavaoop.innerclasss;

public class Company { // outer class
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Inner Class
    public class Employee {
        private String name;

        // Kode Mengakses Outer Class
        public String getCompany() {
            return Company.this.name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
