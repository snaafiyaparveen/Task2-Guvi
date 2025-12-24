package com.example.employeeApp.controller;

import com.example.employeeApp.model.Employee;
import com.example.employeeApp.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("employee", new Employee());
        return "index";
    }

    @PostMapping("/save")
    public String saveEmployee(@ModelAttribute Employee employee){
        employeeRepository.save(employee);
        return "redirect:/displayAll";
    }

    @GetMapping("/displayAll")
    public String displayAll(Model model){
        List<Employee> employees = employeeRepository.findAll();
        model.addAttribute("employees", employees);
        return "displayAll";
    }

    @GetMapping("/display/{id}")
    public String displayByID(@PathVariable String id, Model model){
        Optional<Employee> employee = employeeRepository.findById(id);
        employee.ifPresent(value -> model.addAttribute("employee", value));
        return "displayOne";
    }

    @GetMapping("/api/employees")
    @ResponseBody
    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }

    @GetMapping("/api/employees/{id}")
    @ResponseBody
    public Optional<Employee> getEmployeeById(@PathVariable String id){
        return employeeRepository.findById(id);
    }
}
