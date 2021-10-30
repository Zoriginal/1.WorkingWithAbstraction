package A1WorkingWithAbstraction.A1Lab.A3StudentSystem;

import java.util.HashMap;
import java.util.Map;

public class StudentSystem {
    private Map<String, Student> studentMap;

    public StudentSystem() {
        this.studentMap = new HashMap<>();
    }

    public Map<String, Student> getRepo() {
        return this.studentMap;
    }

    public void parseCommand(String[] args) {
        String command = args[0];
        String name = args[1];
        switch (command){
            case "Create":
                int age = Integer.parseInt(args[2]);
                double grade = Double.parseDouble(args[3]);
                Student student = new Student(name,age,grade);
                studentMap.putIfAbsent(name,student);
                break;
            case "Show":
                if(studentMap.containsKey(name)){
                    Student student1 = studentMap.get(name);
                    StringBuilder output = new StringBuilder();
                    output.append(String.format("%s is %s years old.", student1.getName(), student1.getAge()));
                    if(student1.getGrade() >= 5){
                        output.append(" Excellent student.");
                    }else if(student1.getGrade() >= 3.50){
                        output.append(" Average student.");
                    }else {
                        output.append(" Very nice person.");
                    }
                    System.out.println(output.toString());
                }
                break;
        }
    }
}
