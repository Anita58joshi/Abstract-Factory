package com.anita.pubsub.code2suceed;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PubSubService {

    Map<String, Set<Subscriber>> subscriberMap = new HashMap<>();

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1L,"Anita","Artist"));
        employees.add(new Employee(2L,"Bnita","Artist"));
        employees.add(new Employee(3L,"Snita","Artist"));
        employees.add(new Employee(4L,"Dnita","Artist"));
        employees.add(new Employee(5L,"Pnita","Artist"));

        //key, Value
        Map<String, Employee> employeeMap  = employees
                .stream()
                //.collect(Collectors.toMap(Employee::getName, Function.identity()));
                .collect(Collectors.toMap(employee -> employee.getName(),employee -> employee ));

        //manually data
       // employeeMap.put("Anita", new Employee(1L,"Anita","Artist"));

        Employee employee = employeeMap.get("Anita");
        System.out.println(employee);


//        List<String> names = Arrays.asList("Anita", "Sunita","Babita","Anita");
//        System.out.println(names);
//        Set<String> nameSet = new HashSet<>();
//        nameSet.add("Anita");
//        nameSet.add("Dnita");
//        nameSet.add("Anita");
//        nameSet.add("Anita");
//        nameSet.add("Anita");
//
//        System.out.println(nameSet);
    }

}
