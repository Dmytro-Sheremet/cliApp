package com.ds.testask.departmentdemo.cli;

import com.ds.testask.departmentdemo.entity.Employee;
import com.ds.testask.departmentdemo.service.DepartmentService;
import com.ds.testask.departmentdemo.service.EmployeeService;
import com.ds.testask.departmentdemo.tempHelper.DBInitialDataFiller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;


@ShellComponent
public class CLIController {
    private final String ANSWER = "Answer: ";


    private DBInitialDataFiller dbInitialDataFiller;
    private DepartmentService departmentService;
    private EmployeeService employeeService;
    private CLIOutputFormatHelper cliOutputHelper;


    @Autowired
    public CLIController(DBInitialDataFiller dbInitialDataFiller,
                         DepartmentService departmentService,
                         CLIOutputFormatHelper cliOutputHelper,
                         EmployeeService employeeService
    ) {
        this.employeeService = employeeService;
        this.dbInitialDataFiller = dbInitialDataFiller;
        this.departmentService = departmentService;
        this.cliOutputHelper = cliOutputHelper;

        System.out.println("\t\t--------------------------------------------");
        System.out.println("\t\t|  DEPARTMENT TEST-DEMO SHELL APPLICATION  |");
        System.out.println("\t\t--------------------------------------------");
    }


    @PostConstruct
    public void postInitialization() {
        System.out.println("writing initial data into DataBase...");
        dbInitialDataFiller.fillIntoDB();
        System.out.println("DataBase is ready.");
        System.out.println("type \'help\' for help if you want help");
        System.out.println();
        System.out.println();
    }


    @ShellMethod(
            value = "find head of department by \"department name\"",
            key = "Who is head of department"
    )
    public String findHeadOfDepartment(String fullDepartmentName) {
        return ANSWER + cliOutputHelper.getFormattedString(
                departmentService.findHeadOfDepartment(fullDepartmentName)
        );

    }

    @ShellMethod(
            value = "Show department statistics by \' fulldepartment name\'",
            key = "Show statistic for department"
    )
    public String showDepartmentStatistic(String fullDepartmentName) {

        return ANSWER + cliOutputHelper.getFormattedString(
                departmentService.getDepartmentStatistics(
                        fullDepartmentName
                )
        );
    }

    @ShellMethod(
            value = "Get Average salary of department by \' fulldepartment name\'",
            key = "Show the average salary for department"
    )
    public String showAverageSalaryOfDepartment(String fullDepartmentName) {

        return ANSWER + "Average salary of department '" + fullDepartmentName + "' is: " +
                departmentService.getAverageSalaryOfDepartment(fullDepartmentName);

    }

    @ShellMethod(
            value = "Show count of employee of department by \' fulldepartment name\'",
            key = "Show count of employees for"
    )
    public String getCountOfEmployees(String fullDepartmentName) {
        return ANSWER + departmentService.getCountOfDepartmentEmployees(fullDepartmentName) + " employees";
    }

    @ShellMethod(
            value = "Search in Employess by name, email phone",
            key = "search"
    )
    public String searchInEmployees(String searchQuery) {

        StringBuilder sb = new StringBuilder();
        List<Employee> employeeList = new ArrayList<>();
        employeeList.addAll(
                employeeService.findEmployeeByNameLike(searchQuery)
        );


        System.out.println(employeeList.get(0).getEmail());

        employeeList.forEach(e -> sb.append(cliOutputHelper.getFormattedString(e)));
        return sb.toString();
    }


}
