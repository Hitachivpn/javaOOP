import java.util.*;


public class Main {

    public static void main(String[] args) {
        
        Employee e1 = new Employee("Сергей", "Трубицын", "frontend", 60000);
        Employee e2 = new Employee("Александр", "Македонский", "java", 93400);
        Employee e3 = new Employee("Александр", "Македонский", "python", 75000);

        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
    
        System.out.println("Результат сравнения: " + e1.equals(e1) + "\n");
        System.out.println("Результат сравнения: " + e1.equals(e2) + "\n");
        System.out.println("Результат сравнения: " + e2.equals(e3) + "\n");
    
        System.out.println(e1.hashCode() == e2.hashCode());
        System.out.println(e2.hashCode() == e3.hashCode());
        }
}
