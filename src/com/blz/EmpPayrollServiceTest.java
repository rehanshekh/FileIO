package com.blz;

import java.util.Arrays;

import static com.blz.EmpPayrollService.IOService.FILE_IO;

public class EmpPayrollServiceTest {
    public static void main(String[] args) {
        EmpPayrollData[] arrayOfEmp = {new EmpPayrollData(1, "Rehan", 120000),
                new EmpPayrollData(2, "Ramiz", 362000)
        };

        EmpPayrollService empPayrollService;
        empPayrollService = new EmpPayrollService(Arrays.asList(arrayOfEmp));
empPayrollService.writeEmpPayrollData(FILE_IO);
    }
}