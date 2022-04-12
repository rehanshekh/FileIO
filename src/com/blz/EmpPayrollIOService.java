package com.blz;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class EmpPayrollIOService {
    public static String FILE_NAME = "payroll-file.txt";

    public static void writeData(List<EmpPayrollData> empPayrollList) {
        StringBuffer empBuffer = new StringBuffer();
        empPayrollList.forEach(employee -> {
            String empDataString = employee.toString().concat("\n");
            empBuffer.append(empDataString);
        });
        try {
            Files.write(Paths.get(FILE_NAME),empBuffer.toString().getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
