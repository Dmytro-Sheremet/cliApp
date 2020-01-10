package com.ds.testask.departmentdemo.cli;

import com.ds.testask.departmentdemo.entity.Degree;
import com.ds.testask.departmentdemo.entity.Employee;

import java.util.Map;

public interface CLIOutputFormatHelper {

    String getFormattedString(Employee employee);

    String getFormattedString(Map<Degree, Long> departmentEmployeesDegreestatistic);


}
