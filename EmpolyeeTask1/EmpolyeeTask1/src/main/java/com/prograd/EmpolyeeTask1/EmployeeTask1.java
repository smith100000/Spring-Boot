package com.prograd.EmpolyeeTask1;

public class EmployeeTask1 {
    private String EmpName;


    private int EmpId;
    private int EmpAge;
    public EmployeeTask1(String EmpName,int EmpAge,int EmpId){
        this.EmpName=EmpName;
        this.EmpId=EmpId;
        this.EmpAge=EmpAge;
    }

    public String getEmpName() {
        return EmpName;
    }

    public void setEmpName(String empName) {
        EmpName = empName;
    }

    public int getEmpId() {
        return EmpId;
    }

    public void setEmpId(int empId) {
        EmpId = empId;
    }

    public int getEmpAge() {
        return EmpAge;
    }

    public void setEmpAge(int empAge) {
        EmpAge = empAge;
    }
}
