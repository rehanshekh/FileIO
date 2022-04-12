package com.blz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static com.blz.EmpPayrollService.IOService.CONSOLE_IO;
import static com.blz.EmpPayrollService.IOService.FILE_IO;

public class EmpPayrollService {
    public List<EmpPayrollData> empPayrollList;

    public EmpPayrollService() {
    }

    public EmpPayrollService(List<EmpPayrollData> empPayrollList) {
        this.empPayrollList = empPayrollList;
    }

    public static void main(String[] args) {
        ArrayList<EmpPayrollData> empPayrollList = new ArrayList<>();
        EmpPayrollService empPayrollService = new EmpPayrollService(empPayrollList);
        Scanner consoleInputReader = new Scanner(System.in);
        empPayrollService.readEmpPayrollData(consoleInputReader);
        empPayrollService.writeEmpPayrollData(CONSOLE_IO);
    }

    public void writeEmpPayrollData(EmpPayrollService.IOService ioService) {
        if (ioService.equals(CONSOLE_IO)) {
            System.out.println("\nWriting Employee Payroll Roaster to Console\n" + empPayrollList);
        } else if (ioService.equals(FILE_IO)) {
            EmpPayrollIOService.writeData(empPayrollList);
        }
    }
    public void readEmpPayrollData(Scanner consoleInputReader) {
        System.out.println("Enter Employee id:");
        int id = consoleInputReader.nextInt();
        System.out.println("Enter Employee Name:");
        String name = consoleInputReader.next();
        System.out.println("Enter Employee Salary");
        double salary = consoleInputReader.nextInt();
        empPayrollList.add(new EmpPayrollData(id, name, salary));
    }

    public enum IOService {CONSOLE_IO, FILE_IO, DB_IO, REST_IO}

}
