package com.ds.testask.departmentdemo.cli;

import com.ds.testask.departmentdemo.entity.Degree;
import com.ds.testask.departmentdemo.entity.Employee;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class CLIOutputFormatHelperImpl implements CLIOutputFormatHelper {
    final String NL = System.getProperty("line.separator");
    final String E = ";   ";

    @Override
    public String getFormattedString(Employee employee) {

        StringBuilder sb = new StringBuilder();
        sb
                .append("ID: ").append(employee.getId()).append(E)
                .append("FIRST NAME: ").append(employee.getFirstName()).append(E)
                .append("LAST NAME: ").append(employee.getLastName()).append(E)
                .append("EMAIL: ").append(employee.getEmail()).append(E)
                .append("PHONE: ").append(employee.getMobilePhoneNumber()).append(E)
                .append("DEGREE: ").append(employee.getDegree()).append(E)
                .append(NL);

        return sb.toString();
    }

    @Override
    public String getFormattedString(Map<Degree, Long> departmentEmployeesDegreeStatistic) {
        System.out.println(departmentEmployeesDegreeStatistic);
        StringBuilder sb = new StringBuilder();
        sb.append(NL);

        departmentEmployeesDegreeStatistic.forEach((degree, count) -> {
                    sb
                            .append("DEGREE ").append(degree.getTitle())
                            .append(" - ")
                            .append(count)
                            .append(" EMPLOYEES")
                            .append(E)
                            .append(NL);
                }
        );

        return sb.toString();
    }
}
